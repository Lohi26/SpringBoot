package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.newClass.Nothing;
import com.example.demo.repo.nothingRepo;

@Controller
public class homeController {
	
	@Autowired
	nothingRepo nothingrep;
	
	@RequestMapping("")
	public String home()
	{
		System.out.println("Compiled...successfully...SpringBoot");
		return "home";
	}
	
	
	@RequestMapping("/addNothing")
	public String addNothing(Nothing nothing)
	{
		nothingrep.save(nothing);
		return "home";
	}
}
