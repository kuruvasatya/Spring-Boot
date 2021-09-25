package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.dao.DepartmentRepository;
import com.main.entity.Department;
import com.main.entity.Student;
import com.main.service.DepartmentService;
import java.util.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService service;
	
	@GetMapping("")
	public List<Department> getDepartments()
	{
		return service.getAllDepartments();
	}
	
	@GetMapping("/count")
	public String getDepartmentCount()
	{
		Long count = service.getCountOfDepartments();
		return "There are " + count + " departments";
	}
	
	@GetMapping("{id}/students")
	public List<Student> getStudentsInDepartment(@PathVariable("id") int id){
		return service.getStudentsInDepartment(id);
	}
	
	@GetMapping("/{name}")
	public Department departmentDetails(@PathVariable("name") String name)
	{
		return service.getDepartment(name);
	}
	
	@PostMapping("")
	public void saveDepartment(@RequestBody Department department)
	{
		service.addDepartment(department);
	}
	
	@DeleteMapping("/departments/{name}")
	public void deleteDepartment(@PathVariable("name") String name)
	{
		service.deleteDepartment(name);
	}
	
	
	
}
