package com.h2kinfosys.learn.day04;

public class ArrayTest {

	public static void main(String[] args) {
		int s1 = 89;
		int s2 = 90;
		int s3 = 91;
		int marks[] = {89,90,91,92,93,94};
		
		System.out.println(marks.length);
		System.out.println(marks[4]);
		int total = 0;
		for(int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}
		System.out.println("Total :: " + total );
		
		total = 0;
		for (int subMarks : marks) {
			total = total + subMarks;
		}
		System.out.println("Total :: " + total );
		
	}

}
