package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class homeController {
    @RequestMapping("")
    public String home(@RequestParam("name")String Myname,@RequestParam("age")Integer Myage,@RequestParam("city")String Mycity,HttpSession session) {
        System.out.println("Compiled.....Successfully...." + Myname);
        session.setAttribute("name", Myname); 
        session.setAttribute("age", Myage);
        session.setAttribute("city",Mycity);///---->data model
        return "home2"; ///------>view
        
        //combination modelview
    }
}

