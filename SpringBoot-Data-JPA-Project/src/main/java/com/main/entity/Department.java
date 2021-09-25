package com.main.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Entity
@SequenceGenerator(name = "SECQNAMEINENTITY", sequenceName = "DB_SECQ NAME", allocationSize = 1)
public class Department {
	@Id
	int id;
	String name;
	@OneToMany(mappedBy="department", cascade=CascadeType.REMOVE)
	List<Student> students = new ArrayList<Student>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(String name) {
		super();
		this.name = name;
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
		
	
}
