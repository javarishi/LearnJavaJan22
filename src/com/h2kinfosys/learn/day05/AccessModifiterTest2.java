package com.h2kinfosys.learn.day05;

public class AccessModifiterTest2 {

	public static void main(String[] args) {
		AccessModifiersTest test =  new AccessModifiersTest();
		System.out.println(test.publicVariable);
		// Private Variables are not visible
		//System.out.println(test.privateVariable);
		System.out.println(test.defaultVariable);
		System.out.println(test.protectedVariable);
	}

}
