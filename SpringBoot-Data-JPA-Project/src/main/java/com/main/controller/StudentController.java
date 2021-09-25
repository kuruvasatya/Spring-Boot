package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.main.entity.Student;
import com.main.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("")
	public List<Student> getStudents()
	{
		return service.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getStudents(@PathVariable("id") int id)
	{
		Optional<Student> student = service.getStudent(id);
		if(student.isPresent()) {
			return student.get();
		}
		else 
			return null;
	}
	
	@PostMapping("")
	public void addStudent(@RequestBody Student student)
	{
		service.addStudent(student);
	}
	
	@GetMapping("/blood/{bloodGroup}")
	public Object[] bloodGroup(@PathVariable("bloodGroup") String bloodGroup)
	{
		return service.findDonar(bloodGroup);
	}
}
