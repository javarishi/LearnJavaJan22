package com.h2kinfosys.learn.day07;

/* 
 * super - instance of Parent Class
 * this - instance of self
 * 
 */
public class Customer extends Person{
	
	public Customer(String gender, int age, String area) {
		this.setAge(age);
		this.setArea(area);
		this.setGender(gender);
		System.out.println("Customer is created");
	}
	
	// observed props
	private String gender;
	private int age;
	private String area;
	
	
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	// methods
	public void browseInterest() {
		System.out.println("Customer Interest Browsing");
	}
	
	
	public float processDiscount() {
		System.out.println("No Discount for new customers ");
		return 0.0f;
	}

	@Override
	public void processPersonData(String race, String gender) {
		// TODO Auto-generated method stub
		
	}

	

}
