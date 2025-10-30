package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// this class will handle the configuration in place of xml file

@Configuration // equivalent to config.xml file
//@ComponentScan(basePackages = "com.springcore.javaconfig") // to tell the base package
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean
	public Student getStudent() {  // Bean name will be same as method name we don't have to write it explicitly different 
		//creating new Student object 
		Student student = new Student(getSamosa());
		return student;
	}
	
}
