package com.sumit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


/**
 *
 * @author avis
 */
@Component
public class WebSocketHandler extends TextWebSocketHandler {
    

   @Override
   protected void handleTextMessage(WebSocketSession session, TextMessage message)
         throws Exception {

      String clientMessage = message.getPayload();

      if (clientMessage.startsWith("Hello") || clientMessage.startsWith("Hi")) {
         session.sendMessage(new TextMessage("Hello! What can i do for you?"));
      }else if (clientMessage.startsWith("Himanshu") || clientMessage.startsWith("himanshu")) {
         session.sendMessage(new TextMessage("bole mere Jarvis...."));
      }
      else {
         session.sendMessage(
               new TextMessage("This is a simple hello world example of using Spring WebSocket."));
      }
   }
 
    
}
