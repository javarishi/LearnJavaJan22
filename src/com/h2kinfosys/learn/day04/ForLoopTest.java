package com.h2kinfosys.learn.day04;

public class ForLoopTest {

	public static void main(String[] args) {
		/*
		 * for(initialization, condition, increment){
		 * 		block of code till condition is true
		 * }
		 * 
		 */
		int total = 0;
		for(int counter = 10; counter >= 1; counter--) {
			total = total + counter;
			System.out.println(counter);
		}
		System.out.println("Total :: " + total);
	}

}
