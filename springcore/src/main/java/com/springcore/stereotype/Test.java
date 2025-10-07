package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = con.getBean("student",Student.class);
        System.out.println(student);
        
        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass().getName());
        
        System.out.println("Hash code of object : "+student.hashCode());  // same hash code as only one object in created (singleton scope)
        
        Student student2 = con.getBean("student",Student.class);
        System.out.println("Hash code of object : "+student2.hashCode());  // same hash code as only one object in created (singleton scope)
        
        Teacher t1 = con.getBean("teacher",Teacher.class);
        System.out.println("Teacher class obj hashcode : "+t1.hashCode());
        
        Teacher t2 = con.getBean("teacher",Teacher.class);
        System.out.println("Teacher class obj hashcode : "+t2.hashCode());
        
        
	}
}
