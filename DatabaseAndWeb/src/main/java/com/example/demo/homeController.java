package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

	@Autowired
	WebappJpa webapp;
	@RequestMapping("")
	public String home()
	{
		System.out.println("Compiled Successfully....");
		return "home";
	}
	
//	@RequestMapping("/addDetails")
//	public String home1(FormFilling formFill)
//	{
//		formRepo.save(formFill);
//		return "home";
//	}
	@RequestMapping("/addDetails")
	public String home1(FillDetails fillDetail)
	{
		webapp.save(fillDetail);
		return "home";
	}
}
