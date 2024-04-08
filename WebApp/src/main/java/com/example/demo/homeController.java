package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController 
{
	@RequestMapping("")
	public ModelAndView home(NewClass newclass) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj", newclass);
		mv.setViewName("home");
		System.out.println("Compiled....Successfully....");
		return mv;
		//passing the entire object using dependency injection
	}
}
