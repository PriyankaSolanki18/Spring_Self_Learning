package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	
	public Person(String name, int personId, Certi certi) {
		System.out.println("Constructor called....");
		this.name=name;
		this.personId=personId;
		this.certi=certi;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.personId+" { "+this.certi.name+" }";
	}
	
}
