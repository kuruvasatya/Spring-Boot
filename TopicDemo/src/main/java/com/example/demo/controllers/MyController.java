package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Topic;
import com.example.demo.services.TopicService;

@RestController
public class MyController {
	
	@Autowired
	TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> allTopics(){
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Topic allTopics(@PathVariable("id") String id){
		return topicService.searchTopic(id);
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable("id") String id){
		 topicService.deleteTopic(id);
	}
	
	@DeleteMapping("/topics")
	public void deleteAll(){
		 topicService.deleteAll();
	}
	
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable("id") String id)
	{
		topicService.updateTopic(id, topic);
	}
	
	
}
