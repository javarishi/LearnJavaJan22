package com.h2kinfosys.learn.day07;


/*
 * final classes cannot be extended 
 * final methods cannot be overridden (overloading is possible)
 * final variables - cannot be reassigned 
 */
public final class VIPCustomer extends CreditCardCustomer{
	
	private final String companyName = "Best Buy Inc";

	public VIPCustomer(String gender, int age, String area, String name, String emailAddress, String address,
			String ssn) {
		super(gender, age, area, name, emailAddress, address, ssn);
		//this.companyName = "Walmart";
	}

}
