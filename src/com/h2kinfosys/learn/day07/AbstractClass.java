package com.h2kinfosys.learn.day07;

public class AbstractClass  {
	
	public static void main(String[] args) {
		// Person person = new Person();
		CreditCardCustomer ccCust = 
				new CreditCardCustomer("M", 23, "Symrna", "Niel", "niel@nasa.com", "3370 Spring Hill Pwky", "324398749");
		ccCust.changeValidationMethod("MyMapsIndia.com");
	}

}
