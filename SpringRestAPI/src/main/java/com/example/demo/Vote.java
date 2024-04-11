package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vote {
	@Id
	private int id;
	private String name;
	private int age;
	private String eligible;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getEligible() {
		return eligible;
	}
	public void setEligible(String eligible) {
		this.eligible = eligible;
	}
	@Override
	public String toString() {
		return "Vote [id=" + id + ", name=" + name + ", age=" +age+ ", eligible=" + eligible + "]";
	}
}
