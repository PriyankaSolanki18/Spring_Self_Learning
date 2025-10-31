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
	
	// instead of just using @Bean we can use name attribute with it as
	// @Bean(name = {"student","temp","con"})  -> is case me jo bean Student class return karegi usko container in 3 namo se attach ker dega or ham main method me inmese kisi bhi naam se access ker skte h , getStudent ki jagah jo ki default naam hota agar ham explicitly mention na kerte
	// Student student = context.getBean("getStudent",Student.class);  // ye line DemoMain.java file se h or isme getStudent ki jagah ham upar ke 3 naam me se koi sa bhi use ker skte h same output aayega
	//
	@Bean
	public Student getStudent() {  // Bean name will be same as method name we don't have to write it explicitly different 
		//creating new Student object 
		Student student = new Student(getSamosa());
		return student;
	}
	
}
