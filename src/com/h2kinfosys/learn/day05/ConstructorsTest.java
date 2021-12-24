package com.h2kinfosys.learn.day05;

public class ConstructorsTest {
	/*
	 * 1. Access Modifier - public/ private - instance / static
	 * 2. Name of method - exactly same as ClassName
	 * 3. Parameters / Input to Methods - one - many 
	 * 4. Method Body {} 
	 * 5. Exception - Learn this later
	 * 6. Rules of overloading are exactly same for Constructor
	 */
	
	public ConstructorsTest() {
		System.out.println("This is My First Constructor");
	}
	
	public ConstructorsTest(String test) {
		System.out.println("This is My First Constructor :: " + test);
	}
	
	public ConstructorsTest(int test) {
		System.out.println("This is My First Constructor :: " + test);
	}
	
	public ConstructorsTest(int test, String secondTest) {
		System.out.println("This is My First Constructor :: " + test);
	}
	
	public static void main(String[] args) {
		// ClassName instanceName = new ClassName()
		ConstructorsTest test = new ConstructorsTest(100, "Someting"); // Constructor
	}

}
