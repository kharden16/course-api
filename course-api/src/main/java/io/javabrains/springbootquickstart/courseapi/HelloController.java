package io.javabrains.springbootquickstart.courseapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController 
public class HelloController {
	
	//@RequestMapping("/hello") //takes a parameter for the the URL mapped
	public String sayHi()
	{
		return "Hi";
	}
}