package com.h2kinfosys.learn.day10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	// What is Set?
	// No Duplicates. Unorde - No Positions - random
	
	// Types of Sets
	// HashSet , TreeSet
	
	
	public static void main(String[] args) {
		// Instance of Set Interface
		Set<String> items = new TreeSet<String>();
		Set<String> basket = new TreeSet<String>();
		
		// adding an element
		items.add("Mangos");
		items.add("Apples");
		items.add("Orages");
		System.out.println(items);
		
		boolean isAdded = items.add("Mangos");
		System.out.println("No Duplicates are allowed :: " + isAdded);
		// removing an element
		items.remove("Mangos");
		System.out.println(items);
		
		// Size
		System.out.println(items.size());
		
		// Iteration
		for(String eachItem : items) {
			System.out.println(eachItem);
		}
		
		// membership 
		if (items.contains("Apples")) {
			System.out.println("Apples are present");
		}else {
			System.out.println("Apples are not present");
		}
		
		basket.add("Tomatos");
		basket.add("Potatos");
		basket.add("Onions");
		basket.add("Apples");
		
		items.addAll(basket);
		System.out.println(items);
		

	}

}
