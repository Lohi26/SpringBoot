package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Whatever {
	private String firstname;
	private String lastname;
	private String email;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void show()
	{
		System.out.println("Hello SpringBoot let me say you something....! you're amazing");
	}
}
