package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

	@Autowired
	PlacementRepo placementRepo;
	
	@RequestMapping("")
	public String home()
	{
		System.out.println("Compiled Successfully....");
		return "home";
	}
	
	@PostMapping("placement")
	public Placement addPlacement(Placement placement)
	{
		placementRepo.save(placement);
		return placement;
	}
	
	@RequestMapping(path="placement")
	@ResponseBody
	public List<Placement> getPlacement(){
		return placementRepo.findAll();
	}
	
	@RequestMapping("placement/{id}")
	@ResponseBody
	public Optional<Placement> getPlacement(@PathVariable int id)
	{
		return placementRepo.findById(id);
	}
}
