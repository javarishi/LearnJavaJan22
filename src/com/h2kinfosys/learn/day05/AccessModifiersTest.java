package com.h2kinfosys.learn.day05;

public class AccessModifiersTest {

	// members - variables and methods
	public String publicVariable = "Public Variable";
	private String privateVariable = "Private Variable";
	String defaultVariable = "Default Variable";
	protected String protectedVariable = "Protected Variable";
	
	
	public static void main(String[] args) {
		AccessModifiersTest test =  new AccessModifiersTest();
		System.out.println(test.publicVariable);
		System.out.println(test.privateVariable);
		System.out.println(test.defaultVariable);
		System.out.println(test.protectedVariable);
	}

}
