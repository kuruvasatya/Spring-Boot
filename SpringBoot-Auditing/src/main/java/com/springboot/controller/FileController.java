package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.FileRepository;
import com.springboot.dto.Request;
import com.springboot.service.FileService;

@RestController
public class FileController {

	@Autowired
	FileService service;

	@PostMapping("/file")
	public ResponseEntity<String> addFile(@RequestBody Request userRequest) {
		return new ResponseEntity<String>(service.saveFile(userRequest), HttpStatus.OK);
	}

	@PutMapping("/file/{id}/{desc}")
	public ResponseEntity<String> updateFile(@PathVariable("id") int id, @PathVariable("desc") String description,
			@RequestBody Request request) {
		return new ResponseEntity<String>(service.updateFile(id, description, request), HttpStatus.OK);
	}
}
