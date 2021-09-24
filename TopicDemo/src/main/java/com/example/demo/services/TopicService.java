package com.example.demo.services;

import com.example.demo.pojo.Topic;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topicList = new ArrayList<Topic>(Arrays.asList(
			new Topic("java1", "Spring framework", "java description"),
			new Topic("python", "Data analytics", "python description"),
			new Topic("java2", "Hibernate framework", "java JDBC description")		
			));

	public List<Topic> getAllTopics() {
		return topicList;
	}
	
	public void addTopic(Topic topic)
	{
		topicList.add(topic);
	}
	
	public Topic searchTopic(String id)
	{
		ArrayList<Topic> topic =  (ArrayList<Topic>) topicList.stream()
				 					.filter(e -> (e.getId().equals(id)))
				 					.collect(Collectors.toList());
		return topic.get(0);
	}
	
	public void deleteTopic(String id)
	{
		topicList = topicList.stream()
							.filter(e -> !(e.getId().equals(id)))
							.collect(Collectors.toList());
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		topicList.clear();
	}

	public void updateTopic(String id, Topic topic) {
		for(Topic t:topicList) 
		{
			if(t.getId().equals(id)) 
			{
				t.setId(topic.getId());
				t.setName(topic.getName());
				t.setDescription(topic.getDescription());
			}
		}
	}
	
}
