package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Component;

@Component
public class Topic {
	 	
		private String id;
		private String name;
		private String description;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public Topic(String i, String n, String d)
		{
			id = i;
			name = n;
			description = d;
		}
		public Topic()
		{
			id = " ";
			name = " ";
			description = " ";
		}
}
