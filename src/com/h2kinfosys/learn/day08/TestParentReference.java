package com.h2kinfosys.learn.day08;

import com.h2kinfosys.learn.day07.CreditCardCustomer;
import com.h2kinfosys.learn.day07.Customer;
import com.h2kinfosys.learn.day07.PreferredCustomer;
import com.h2kinfosys.learn.day07.Reachable;

public class TestParentReference {

	public static void main(String[] args) {
		// ClassName objectName = new ClassName()
		// ClassName objectName = new Constructor()
		// ReferenceType objname = new InstanceType()
		CreditCardCustomer ccCust = 
				new CreditCardCustomer("M", 23, "Symrna", "Niel", "niel@nasa.com", "3370 Spring Hill Pwky", "324398749");
		ccCust.processLoyaltyPoints(100.0f);
		
		// Parent Class can act as Reference Type for Child Class
		PreferredCustomer pccCust 
			= new CreditCardCustomer("M", 23, "Symrna", "Niel", "niel@nasa.com", "3370 Spring Hill Pwky", "324398749");
		pccCust.processPromotions();
		
		Customer cccCust 
			= new CreditCardCustomer("M", 23, "Symrna", "Niel", "niel@nasa.com", "3370 Spring Hill Pwky", "324398749");
	
		
		Reachable reachCustomer = 
				new CreditCardCustomer("M", 23, "Symrna", "Niel", "niel@nasa.com", "3370 Spring Hill Pwky", "324398749");
		reachCustomer.validateAddress("address");
		
		Object obj = 
				new CreditCardCustomer("M", 23, "Symrna", "Niel", "niel@nasa.com", "3370 Spring Hill Pwky", "324398749");
		
		
		
		// 1. Visibility of Members comes from ReferenceType
		
		// 2. Execution of Method comes from InstanceType
		
	}

}
