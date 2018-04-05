package io.rajkavuru.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return Arrays.asList(
				new Topic("raj", "AWS JAVA", "Cloud Architect"),
				new Topic("anu", "Performance", "Performance Engineering"),
				new Topic("xyz", "HP Tandem", "Non-Stop Servers"),
				new Topic("java", "Java J2EE", "Core Java")
				);
	}
}
