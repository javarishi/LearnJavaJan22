package com.h2kinfosys.learn.day04;

public class DoWhileLoopTest {

	public static void main(String[] args) {
		// Total of 1 to 10
		
		/*
		 * do{
		 * 		block of code till condition is true
		 * 		condition modifier 
		 * }while (Condition);
		 */
		int counter = 100;
		int total = 0;
		
		do {
			total = total + counter;
			System.out.println("Counter Value ::" + counter);
			counter++;
		}while (counter <= 10);
		
		System.out.println("Total :: " + total);

	}

}
