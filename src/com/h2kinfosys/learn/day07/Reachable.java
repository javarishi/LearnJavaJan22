package com.h2kinfosys.learn.day07;

public interface Reachable {
	
	/*
	 * Variables in interface are always 	 * public 	 * static 	 * final
	 */
	
	String validationMethod = "GoogleMaps";
	/*
	 * public - accessible by anyone
	 * abstract - no implementation
	 */
	boolean validateAddress(String adress);
	// Post Java 8 - you can add default and Private methods in Interface
	default void changeValidationMethod(String method) {
		System.out.println("Trying new Validation Method with " + method);
		testPrivateMethods(method);
	}
	
	private void testPrivateMethods(String test) {
		System.out.println("This is Private Method in Interface Reachable");
	}
	// Post java 9 
	static void changeMaps(String newMaps) {
		System.out.println("Maps are updated");
	}
	
}
