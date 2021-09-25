package com.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.main.entity.Department;
import com.main.entity.Student;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	Department findByName(String name);

	void deleteByName(String name);

	//@Query(value="select e from Student e inner join e.department d where d.id=:id")
	//List<Student> getAllStudentsInDept(@Param("id") int id);

}
