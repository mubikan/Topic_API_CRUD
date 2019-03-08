package com.AppliedPro.springboot.Topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(	
				new Topic("Spring", "Spring Framework", "SpringFramework"),
				new Topic("Java", "Java Course", "Java Course Description"),
				new Topic("Node", "Node JS", "Node JS Description")
				);
	public List<Topic> getAlltopics()
	{
		return topics;
	}
	public Topic getTopic(String id) {
		
		Topic topic = null;
		
		for(Topic t: topics)
		{
			if(t.getId().equals(id)) {
				topic = t;
				break;
			}
		}	
		return topic;
	}
}