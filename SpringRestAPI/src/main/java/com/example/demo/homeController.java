package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

	@Autowired
	Voterepo voteRepo;
	
	@RequestMapping("")
	public String home()
	{
		System.out.println("Compiled Successfully!!...");
		return "home";
	}
	
	@PostMapping("vote")
	public Vote post(Vote vote)
	{
		voteRepo.save(vote);
		return vote;
	}
	
	@DeleteMapping("vote/{id}")
	public String delete(@PathVariable int id)
	{
		Vote v=voteRepo.getOne(id);
		voteRepo.delete(v);
		return "Deleted";
	}
	
	
	@PutMapping("vote")
	public Vote put(@RequestBody Vote vote)
	{
		voteRepo.save(vote);
		return vote;
	}
	
	@RequestMapping("vote")
	@ResponseBody
	public List<Vote> showing(Vote vote)
	{
		return (List<Vote>) voteRepo.findAll();
	}
	
	@RequestMapping("vote/{id}")
	@ResponseBody
	public Optional<Vote> show(@PathVariable int id)
	{
		return voteRepo.findById(id);
	}
	
	
}
