package com.example.demo;

import java.util.*;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private static List<Topic> topics= new ArrayList<>(Arrays.asList(
		new Topic("jigsrh","cujdhc","dewfew"),
		new Topic("cfewf","efwf","vfrdfc"),
		new Topic("cdscvs","vsv","vvfdv")
			
			
			));
	
	public List<Topic> getallTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0;i<=topics.size()-1;i++)
		{
			Topic t =topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
	topics.removeIf(t -> t.getId().equals(id));
		
	}

	



	

	
}
