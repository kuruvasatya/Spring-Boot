package com.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.main.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("select e.name,d.name from Student e inner join e.department d where e.bloodGroup=:bg")
	Object[] findDonar(@Param("bg") String bloodGroup);

}
