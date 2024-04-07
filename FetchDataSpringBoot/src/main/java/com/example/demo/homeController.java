package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
		
		@Autowired
		AddStranger stranger;
		
		@RequestMapping("")
		public String home()
		{
			System.out.println("compiled...successfully");
			return "home";
		}
		
		@RequestMapping("/home1")
		public String home1(Stranger strange)
		{
			stranger.save(strange);
			return "home";
		}
		
		@GetMapping("/home2")
		public ModelAndView home2(@RequestParam int id)
		{
			ModelAndView mv=new ModelAndView("get");
			Stranger strange=stranger.findById(id).orElse(new Stranger());
			mv.addObject(strange);
			return mv;
			
		}
}
