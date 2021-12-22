package com.h2kinfosys.learn.day03;

public class Controls {

	
	public static void main(String[] args) {
		int first = 100;
		int second = 1000;
		
		/*
		 * Condition - derives a boolean result
		 * if(Condition){
		 * 		block of code which executes when condition is true
		 * 		// if can have if block
		 * }else {
		 * 		(optional) block of code which executes when condition is false
		 * }
		 */
		
		if(first > second) {
			System.out.println("True Condition :: Greater variables is " + first);
		}else if (first == second) {
				System.out.println("Equal Condition ::Variables are equal " + first);
			}else {
				System.out.println("False Condition ::Greater variables is " + second);
			}
		}
		

}
