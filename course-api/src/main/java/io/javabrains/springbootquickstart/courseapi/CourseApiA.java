package io.javabrains.springbootquickstart.courseapi;
//package io.javabrains.springbootquickstart.courseapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;


//From: Spring Boot Quick Start Javabrains

//@EnableSwagger2WebMvc
@SpringBootApplication
@ComponentScan(basePackages="io.javabrains")
public class CourseApiA  {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiA.class, args);
	}

}