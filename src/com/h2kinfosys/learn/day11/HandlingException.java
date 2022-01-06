package com.h2kinfosys.learn.day11;

public class HandlingException {
	
	/*
	 * 1. One Risk one try - recommendation
	 * 2. Many Catch blocks for single try
	 * 3. You can handle Parent / Generic Exception than specific one 
	 * 4. Child First Parent Later, Specific FIrst - Generic Later - catch ladder
	 * 5. You can combine Exceptions in catch block with |
	 * 6. try - needs either catch or finally or both 
	 * try{
	 * 		risky code  - Batch Execution 
	 * 		which might throw an exception
	 * }catch(Exception ex){
	 * 		Handling Logic for ex
	 * }finally{
	 * 		Code executes regardless of exception
	 * }
	 */

	public static void main(String[] args) {
		int[] samples = {10,20,30,40,50};
		int calc = 10;
		System.out.println(samples[1]);
		System.out.println("Operation total Calculation");
		
		try {
			System.out.println(samples[3]/calc);
		}catch( ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			System.out.println("Handling Properly:: " + ex.getMessage());
		}catch (Exception ex) {
			System.out.println("Unknwon Exception :: " + ex.getMessage());
		}finally {
			System.out.println("Closure code");
		}
		
		String age = "21";
		
		try {
			int age_int = Integer.parseInt(age);
			System.out.println(age_int);
		}finally {
			System.out.println("Conversion Successful");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Operation Average Calculation");
		
		Validation val = new Validation();
		try {
			val.validateAge(2);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

}







