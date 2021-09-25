package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.DepartmentRepository;
import com.main.entity.Department;
import com.main.entity.Student;

import java.util.*;

import javax.transaction.Transactional;

@Service
@Transactional
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepo;
	
	public List<Department> getAllDepartments()
	{
		return departmentRepo.findAll();
	}
	
	public void addDepartment(Department department)
	{
		departmentRepo.save(department);
	}
	
	public long getCountOfDepartments()
	{
		return departmentRepo.count();
	}

	public Department getDepartment(String name) {
		return departmentRepo.findByName(name);
	}

	public void deleteDepartment(String name) {
		
		departmentRepo.deleteByName(name);
	}

	public List<Student> getStudentsInDepartment(int id) {
		return departmentRepo.getAllStudentsInDept(id);
	}
	
	
}
