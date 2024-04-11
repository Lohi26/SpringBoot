package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Matchfavo {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String favIPLTeam;
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
	public String getFavIPLTeam() {
		return favIPLTeam;
	}
	public void setFavIPLTeam(String favIPLTeam) {
		this.favIPLTeam = favIPLTeam;
	}
	@Override
	public String toString() {
		return "Matchfavo [id=" + id + ", name=" + name + ", favIPLTeam=" + favIPLTeam + "]";
	}
}
