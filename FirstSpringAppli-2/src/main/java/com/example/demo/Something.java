
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Something {
	
	private int id;
	private String name;
	private String city;
	@Autowired
	public Whatever what;
	public Something()
	{
		super();
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Whatever getWhat() {
		return what;
	}
	public void setWhat(Whatever what) {
		this.what = what;
	}
	public void print()
	{
		System.out.println("Hello SpringBoot, you're very interesting...");
		what.show();
	}
}
