package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController 
{
	@Autowired
	Knowledgerepo knowledgeRepo;
	
	@RequestMapping("")
	public String home()
	{
		System.out.println("Compiled Successfully...!");
		return "home";
	}
	
	
	@PostMapping("knowledge")
	public Knowledge addKnowledge(Knowledge knowledge)
	{
		knowledgeRepo.save(knowledge);
		return knowledge;
	}
	
	@DeleteMapping("knowledge/{id}")
	public String delete(@PathVariable int id)
	{
		Knowledge kd=knowledgeRepo.getOne(id);
		knowledgeRepo.delete(kd);
		return "Deleted";
	}
	
	@PutMapping("knowledge")
	public Knowledge updateKnowledge(@RequestBody Knowledge knowledge)
	{
		knowledgeRepo.save(knowledge);
		return knowledge;
	}
	
	@RequestMapping("knowledge")
	@ResponseBody
	public List<Knowledge> addKnowledge()
	{
		return (List<Knowledge>) knowledgeRepo.findAll();
	}
	
	@RequestMapping("knowledge/{id}")
	@ResponseBody
	public Optional<Knowledge> addknown(@PathVariable int id)
	{
		return knowledgeRepo.findById(id);
	}
}
