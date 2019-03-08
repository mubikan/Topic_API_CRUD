package com.AppliedPro.springboot.Topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic>getAllTopics1()
	{
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "SpringFramework"),
				new Topic("Java", "Java Course", "Java Course Description"),
				new Topic("Node", "Node JS", "Node JS Description")
				);
	}
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);	
	}
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAlltopics();	
	}
}
