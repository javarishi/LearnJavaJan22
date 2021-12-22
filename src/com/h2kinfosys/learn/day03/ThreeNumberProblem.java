package com.h2kinfosys.learn.day03;

public class ThreeNumberProblem {

	public static void main(String[] args) {
		int first = 1000;
		int second = 200;
		int third = 300;
		
		// Biggest number of three
		if ((first > second) && (first > third)) {
			System.out.println("First Variable is Biggest " + first);
		}else if (second > third) {
			System.out.println("Second Variable is Biggest " + second);
		}else {
			System.out.println("Third Variable is Biggest " + third);
		}

	}

}
