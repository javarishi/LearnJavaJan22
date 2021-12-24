package com.h2kinfosys.learn.day05;

public class MethodOverloading {

	private float normalTaxPercent = 0.1236f;
	private float foodTaxPercent = 0.02f;
	/*
	 * Method Overloading Rules
	 * 1. Method name should be exactly same 
	 * 2. Different parameters - Change in type, change in number of parameters 
	 * 
	 */
	
	
	public float totalAmountWithTax(float totalAmount) {
		return (totalAmount + totalAmount*normalTaxPercent);
	}
	
		
	public float totalAmountWithTax(float totalAmount, boolean isFoodItem) {
		float finalAmount;
		if (isFoodItem) {
			finalAmount = totalAmount + totalAmount*foodTaxPercent;
		}else {
			finalAmount = totalAmount + totalAmount*normalTaxPercent;
		}
		return finalAmount;
	}
	
	public float totalAmountWithTax(float otherItemTotal, float foodItemTotal) {
		float taxAmtOther = otherItemTotal*normalTaxPercent;
		float taxAmtFood = foodItemTotal*foodTaxPercent;
		return ((otherItemTotal+taxAmtOther)+ (foodItemTotal+taxAmtFood));
	}
}
