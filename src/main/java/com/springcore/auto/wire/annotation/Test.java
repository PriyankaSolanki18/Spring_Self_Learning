package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
		Emp emp1 = context.getBean("emp1",Emp.class); //2nd argument is given here because if we only give it name then it will return as object and then we have to typecast it to (Emp) but using 2nd argument we can avoid typecasting
		System.out.println(emp1);
	}

}
