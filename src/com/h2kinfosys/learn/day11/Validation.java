package com.h2kinfosys.learn.day11;

public class Validation {

	// throw - throwing an exception object
	// throws - warning added to method signature 
	public void validateAge(int age) throws InvalidAgeException{
		System.out.println(age);
		if(age > 18) {
			System.out.println("Age is Valid");
		}else {
			throw new InvalidAgeException("Age is Invalid " + age);
		}
	}
}
