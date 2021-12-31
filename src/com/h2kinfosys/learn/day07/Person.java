package com.h2kinfosys.learn.day07;

public abstract class Person {
	
	private String companyData = "Best Buy Inc";
	
	public Person() {
		System.out.println("Abstract classes can have Constructors");
	}

	protected abstract void processPersonData(String race, String gender);
	
	public void nonAbstractMethod(String message) {
		System.out.println("Non Abstract Method in Abstract Class " + message);
	}
	
	
		
}
