package com.h2kinfosys.learn.day03;

public class Operators {

	public static void main(String[] args) {
		// Mathematical Operator
		int first = 100;
		int second = 2;
		System.out.println("Addition : " + (first + second));
		System.out.println("Substraction : " + (first - second));
		System.out.println("Division : " + (first / second));
		System.out.println("Multiplication : " + (first * second));
		System.out.println("Modulus : " + (first % second));
		
		// increment / decrement ++
		// variable++ --> use the value and then increase
		System.out.println("Value of variable " + (first++));
		System.out.println(first);
		// ++variable --> increase the value and then use it
		System.out.println("Value of variable " + (++second));
		
		// Comparison Operators < <= > >= == != 
		// generates - Boolean result 
		System.out.println("Less than :: " + (first < second));
		System.out.println("Less than or equals :: " + (first <= second));
		System.out.println("Greater than :: " + (first > second));
		System.out.println("Greater than or equals :: " + (first >= second));
		System.out.println("Not equals :: " + (first != second));
		System.out.println("Equals :: " + (first == second));
		
		
		// Logical Operators - AND, OR and NOT
		boolean firstBool = true;
		boolean secondBool = false;
		
		/*
		 * Result = S1 && S2
		 * 	S1	S2	Result
		 * 	T	T	T
		 * 	T	F	F
		 * 	F	T	F
		 * 	F	F	F
		 */
		System.out.println(firstBool && secondBool);
		
		/*
		 * Result = S1 || S2
		 * 	S1	S2	Result
		 * 	T	T	T
		 * 	T	F	T
		 * 	F	T	T
		 * 	F	F	F
		 */
		System.out.println(firstBool || secondBool);
		/*
		 * Result = !S1
		 * S1	Result
		 * T	F
		 * F	T
		 */
		System.out.println(!firstBool);
		
	}

}
