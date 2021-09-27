package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.File;

public interface FileRepository extends JpaRepository<File, Integer>{

}
