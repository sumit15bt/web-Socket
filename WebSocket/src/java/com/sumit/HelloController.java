/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author avis
 */
@Controller
public class HelloController {
    
    @RequestMapping("/")
   public String index() {
      return "index";
   }

//     @RequestMapping("/")
//    public String index(ModelMap model) {
//        String s = "sumit";
//        model.addAttribute("name", s);
//        return "welcome";
//    }
    
    @RequestMapping("/realTime")
    public String realTime(ModelMap model) {
        String s = "sumit";
        model.addAttribute("name", s);
        return "realtime";
    }

}
