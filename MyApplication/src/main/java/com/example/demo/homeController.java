package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	
	@RequestMapping("")
	public ModelAndView home(@RequestParam("name")String MyName,@RequestParam("age")Integer MyAge,@RequestParam("city")String city) {
		
		//instead of using HttpSession we use the combination of model and view
		
		ModelAndView mv=new ModelAndView();
		System.out.println("compiled...Successfully...");
		mv.addObject("name", MyName);
		mv.addObject("age",MyAge);
		mv.addObject("city", city);
		mv.setViewName("home");
		return mv;
	}
}
