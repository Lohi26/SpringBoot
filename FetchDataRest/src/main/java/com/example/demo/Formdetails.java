package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Formdetails {
	@Id
	private int id;
	private String name;
	private int cgpa;
	private String language;
	private int studentYear;
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
	public int getCgpa() {
		return cgpa;
	}
	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}
	@Override
	public String toString() {
		return "Formdetails [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", language=" + language
				+ ", studentYear=" + studentYear + "]";
	}
	
}
