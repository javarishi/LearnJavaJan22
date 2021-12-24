package com.h2kinfosys.learn.day04;

public class WhileLoopTest {

	public static void main(String[] args) {
		// Total of 1 to 10
		
		/*
		 * while (Condition){
		 * 		block of code till condition is true
		 * 		condition modifier 
		 * }
		 */
		int counter = 1;
		int total = 0;
		while (counter <= 10) {
			total = total + counter;
			System.out.println("Counter Value ::" + counter);
			counter++;
		}
		System.out.println("Total :: " + total);
	}

}
