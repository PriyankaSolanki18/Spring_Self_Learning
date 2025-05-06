package com.springcore.lifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//work as init() method
		System.out.println("inti : taking pepsi");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//work as destroy method
		System.out.println("destroy : Finished drinking pepsi");
		
	}
	
	
	
}
