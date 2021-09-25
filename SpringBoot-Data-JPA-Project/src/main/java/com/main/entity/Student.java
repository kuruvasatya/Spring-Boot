package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Student {
	@Id
	int id;
	String name;
	String bloodGroup;
	String city;
	String state;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String bloodGroup, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.bloodGroup = bloodGroup;
		this.city = city;
		this.state = state;
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

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", bloodGroup=" + bloodGroup + ", city=" + city + ", state="
				+ state + "]";
	}

}
