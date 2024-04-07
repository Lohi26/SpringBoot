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
	DetailRepo detailRepo;
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("Compiled Successfully...!");
		return "home";
	}
	
	@RequestMapping("/addDetails")
	public String addDetails(Details detail)
	{
		detailRepo.save(detail);
		return "home";
	}
	
	@RequestMapping("/getDetails")
	public ModelAndView home2(@RequestParam int id)
	{
		ModelAndView mv=new ModelAndView("show");
		Details detail=detailRepo.findById(id).orElse(new Details());
		mv.addObject("detail",detail);
		return mv;
		
	}

}
