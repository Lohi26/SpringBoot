package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping("")
	public String home()
	{
		System.out.println("Compiled...successfully...SpringBoot");
		return "home";
	}
}
