package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.StudentRepository;
import com.main.entity.Student;

import java.util.*;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	public void addStudent(Student student) {
		studentRepo.save(student);
	}
	
	public Optional<Student> getStudent(int id) {
		return studentRepo.findById(id);
	}

	public Object[] findDonar(String bloodGroup) {
		return studentRepo.findDonar(bloodGroup);
		
	}

	public List<String> getAllBloodTypes() {
		return studentRepo.findDistictByBloodGroup();
	}
	
	

}
