package com.h2kinfosys.learn.day07;

public class PreferredCustomer extends Customer{
	
	private String name;
	
	private String emailAddress;

	public PreferredCustomer(String gender, 
								int age, 
								String area,
								String name,
								String emailAddress) {
		super(gender, age, area);
		this.setEmailAddress(emailAddress);
		this.setName(name);
		System.out.println("PreferredCustomer Is Created");
	}
	/*
	 * @ something - annotation - additional functionality or information for statement below
	 * 1. Name: Exact same method name
	 * 2. Return type:  should be same or co-variant(class or subclasses)
	 * 3. Access Modifier :: Overriding method cannot be more restrictive than original
	 * 4. Parameters: Exact match
	 * 5. Exception : co-variant (later)
	 */
	@Override
	public final float processDiscount() {
		System.out.println("2.5% Discount for Preferred Customer ");
		return 2.5f;
	}
	
	
	public final float processDiscount(String param) {
		System.out.println("2.5% Discount for Preferred Customer ");
		return 2.5f;
	}
	
	
	public void processPromotions() {
		System.out.println("Send Promotions to Email :: " + this.getEmailAddress());
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
