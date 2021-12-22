package com.h2kinfosys.learn.day02;

public class DataTypes {
	
	// Comment - Single Line
	
	/*
	 * This is interesting 
	 * I can write multiple lines
	 *  */
	
	/**
	 * This is not a comment 
	 * this is Java Docs 
	 */
	// Instance Variables 
	// variable - has to start with alphabet
	int age = 5;
	int _a = 21;
	String customerReturnToVendor = "CRTV010";
	String name = "Sample";
	float percentage = 99.97f;
	boolean isCustomer = false;
	
	// companyName - class Variable - static
	static String companyName = "Best Buy Inc";
	
	public static void main(String[] args) {
		// ClassName instanceName = new ClassName()
		// Instance variables are accessed with . operator on object
		String someString = "Some String Value"; // Local Variables
		DataTypes testDT1 = new DataTypes();
		DataTypes testDT2 = new DataTypes();
		System.out.println(testDT1.age);
		System.out.println(testDT2.age);
		testDT1.age = 21;
		System.out.println(testDT1.age);
		System.out.println(testDT2.age);
		// static variables are not object dependent
		System.out.println(DataTypes.companyName);
		testDT1.companyName = "Best Buy";
		System.out.println(DataTypes.companyName);
		
	}
	
}
