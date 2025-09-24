package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person person1 = context.getBean("person1",Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1.getFeestructure().getClass().getName());
		System.out.println(person1.getProperties().getClass().getName());
		
		System.out.println();
		
		Person person2 = context.getBean("person2",Person.class);
		System.out.println(person2);
		System.out.println(person2.getFriends().getClass().getName());
	}

}
