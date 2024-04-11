package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	@Autowired
	FormRepo formRepo;
	
	@RequestMapping("")
	public String home()
	{
		System.out.println("Complied Successfulyy..");
		return "home";
	}
	
	@RequestMapping("/addFormDetails")
	public String addFormDetails(Formdetails formDetail)
	{
		formRepo.save(formDetail);
		return "home";
	}
	
	@RequestMapping("forms")
	@ResponseBody
	public  List<Formdetails> getFormDetails() {
	    return  formRepo.findAll();
	}

//	@RequestMapping("/forms/204")
//	@ResponseBody
//	public String getFormDetail() {
//	    return  formRepo.findById(204).toString();
//	}
	
	
	@RequestMapping("/forms/{id}")
	@ResponseBody
	public Optional<Formdetails> getDetail(@PathVariable int id)
	{
		return formRepo.findById(id);
	}
}
