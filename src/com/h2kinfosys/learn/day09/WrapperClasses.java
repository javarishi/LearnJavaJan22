package com.h2kinfosys.learn.day09;

public class WrapperClasses {

	int age = 21; // Integer 
	Integer ageWrapper = 21;
	
	float percentage = 99.14F;
	long length = 23948920384L;
	
	public static void main(String[] args) {
		// Identify All the Wrapper CLasses and Print their Limits 
		System.out.println("Integer MIN :: " + Integer.MIN_VALUE + " MAX " + Integer.MAX_VALUE);
		System.out.println("Short MIN :: " + Short.MIN_VALUE + " MAX " + Short.MAX_VALUE);
		String digit = "2022";
		int year = Integer.parseInt(digit);
		System.out.println(year);
		WrapperClasses testWrapper = new WrapperClasses();
		Integer zipC = 30080;
		testWrapper.validateZipCode(zipC);
	}
	
	public void validateZipCode(int zipCode) {
		if((zipCode > 9999) && (zipCode < 100000)) {
			System.out.println("Valid ZipCode");
		}
	}
	
	// AutoBoxing - Primitive to Wrapper
	// Unboxing - Wrapper to Primitive
}
