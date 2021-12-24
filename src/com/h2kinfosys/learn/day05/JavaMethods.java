package com.h2kinfosys.learn.day05;

public class JavaMethods {
	
	private float normalTaxPercent = 0.1236f;
	private float foodTaxPercent = 0.02f;

	public static void main(String[] args) {
		JavaMethods test = new JavaMethods();
		float totalAmount = test.totalAmountWithTax(100.0f, 20.5f);
		System.out.println("Total Billing Amount " + totalAmount);
	}
	
	/*
	 * 1. Access Modifier - public/ private - instance / static
	 * 2. Return Type - output of method (expected)
	 * 3. Name of method - same rules as variables names - Logical
	 * 4. Parameters / Input to Methods - one - many 
	 * 5. Method Body {} 
	 * 6. Exception - Learn this later
	 */

	public float totalAmountWithTax(float totalAmount) {
		return (totalAmount + totalAmount*normalTaxPercent);
	}
	
	public float totalAmountWithTax(float otherItemTotal, float foodItemTotal) {
		float taxAmtOther = otherItemTotal*normalTaxPercent;
		float taxAmtFood = foodItemTotal*foodTaxPercent;
		return ((otherItemTotal+taxAmtOther)+ (foodItemTotal+taxAmtFood));
	}
	// Method Overloading
	
}
