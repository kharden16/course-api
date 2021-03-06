package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/hello")
	public List<Topic> getAllTopics()
	{
		 return Arrays.asList(
			 new Topic("Spring", "Spring Framework", "Spring Frameword Desc"),
			 new Topic("Java", "Java Core", "Java Core Desc")
		);
		//return topicService.getAllTopics();
	}
	
	
	 @RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	@PostMapping(value = "/topics")
	public void addTopic(@RequestBody Topic t)
	{
		topicService.addTopic(t);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic t, @PathVariable String id)
	{
		topicService.updateTopic(t, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}

}
//https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api 
