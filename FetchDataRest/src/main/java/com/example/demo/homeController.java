package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/getFormDetails")
	public ModelAndView getFormDetails(@RequestParam int id) {
	    ModelAndView mv = new ModelAndView("show");
	    Formdetails formDetails = formRepo.findById(id).orElse(new Formdetails());
	    mv.addObject("formDetails", formDetails);
	    System.out.println(formRepo.findByNameAll("Lohita"));
	    return mv;
	}

}
