package com.h2kinfosys.learn.day07;

import java.io.Serializable;

public class CreditCardCustomer extends PreferredCustomer implements Reachable, Cloneable, Serializable{
	
	private String address;
	private String ssn;

	public CreditCardCustomer(String gender, 
									int age, 
									String area, 
									String name, 
									String emailAddress,
									String address,
									String ssn) {
		super(gender, age, area, name, emailAddress);
		System.out.println("Loyalty Credit Card Issued For Customer");
	}

	/*
	@Override
	public float processDiscount() {
		System.out.println("4% Discount for Credit Card Customer ");
		return 4.0f;
	}*/
	
	@Override
	public void processPromotions() {
		super.processPromotions();
		System.out.println("Send Promotions to Address :: " + this.getAddress());
	}
	
	
	public int processLoyaltyPoints(float billingAmt) {
		int final_points = 0;
		if(billingAmt > 0) {
			float points = billingAmt / 4;
			final_points = (int) points;
		}
		return final_points;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public boolean validateAddress(String adress) {
		System.out.println("Address Validation :: " + address + " With " + Reachable.validationMethod);
		Reachable.changeMaps("Update 2.0");
		return true;
	}

}
