package com.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.FileRepository;
import com.springboot.dto.Request;
import com.springboot.entity.File;

@Service
public class FileService {

	@Autowired
	FileRepository repository;

	public String saveFile(Request request) {
		String currentLoggedInUser = request.getLoggedInUser();
		File file = request.getFile();
		file.setCreatedBy(currentLoggedInUser);
		repository.save(file);
		return "file save";
	}

	public String updateFile(int id, String description, Request request) {
		Optional<File> files = repository.findById(id);
		if (files.isPresent()) {
			File file = files.get();
			file.setDescription(description);
			file.setLastModifiedBy(request.getLoggedInUser());
			repository.saveAndFlush(file);
		} else {
			throw new RuntimeException("There is no file with id " + id);
		}
		return "file update succesflly";
	}

}
