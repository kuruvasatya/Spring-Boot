package com.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.main.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("select s.name,d.name from Department d inner join d.students s where s.bloodGroup=:bg")
	Object[] findDonar(@Param("bg") String bloodGroup);

	@Query("select distinct s.bloodGroup from Student s")
	List<String> findDistictByBloodGroup();

	List<Student> findStudentByState(String state);
	
}
