package com.main.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


import java.util.*;

@Entity
public class Department {
	
	@Id
	int id;
	String name;
	@OneToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "st_dpt_fk", referencedColumnName = "id")
	List<Student> students = new ArrayList<Student>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", students=" + students + "]";
	}
	

}
