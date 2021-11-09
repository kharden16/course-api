package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	 private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
				new Topic("basic", "Basic", "Basic Development Course"),
				new Topic("fortran", "Fortran", "Fortran Development course"),
				new Topic("pascal", "Pascal", "Pascal Development Course")));
	 
	 public List<Topic> getAllTopics()
	 {
		 return topics;
	 }

	 public Topic getTopic(String id)
	 {
		for(Topic t: topics)
		{
			if(t.getId().equals(id))
				return t;
		}
		return null;
	 }
	 
	 public void addTopic(Topic t)
	 {
		 topics.add(t);
		 System.out.println("After adding: "+ topics);
	 }
	 
	 public void updateTopic(Topic t, String id)
	 {
		 for(int i = 0; i < topics.size(); i++)
			{
				if(topics.get(i).getId().equals(id))
					topics.set(i, t);
			}
	 }

	public void deleteTopic(String id) {
		 for(int i = 0; i < topics.size(); i++)
			{
				if(topics.get(i).getId().equals(id))
					topics.remove(i);
			}
	}
	 
}
