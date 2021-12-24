package com.h2kinfosys.learn.day04;

import java.util.Calendar;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// int - short and byte, char , String
		
		int day_of_week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		System.out.println("Real Day of Week :: " + day_of_week);
		switch(day_of_week) {
		
			case 1: {
				System.out.println("Store Batch Runs at 8:30 AM");
				break;
			}
			case 2: {
				System.out.println("Store Batch Runs at 7:00 AM");
				break;
			}
			case 3: {
				System.out.println("Store Batch Runs at 7:30 AM");
				break;
			}
			case 4: {
				System.out.println("Store Batch Runs at 7:30 AM");
				break;
			}
			case 5: {
				System.out.println("Store Batch Runs at 8:00 AM");
				break;
			}
			case 6: {
				System.out.println("Store Batch Runs at 7:00 AM");
				break;
			}
			case 7: {
				System.out.println("Store Batch Runs at 8:30 AM");
				break;
			}
			default: {
				System.out.println("Store Batch Runs at 7:45 AM");
				break;
			}
		}
		System.out.println("Out of Switch Case");

	}

}
