package com.h2kinfosys.learn.day10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// HashMap - LinkedHashMap
		LinkedHashMap<Integer, String> nasa = new LinkedHashMap<Integer, String>();
		// adding elements
		nasa.put(101, "Niel Armstrong");
		nasa.put(202, "Buzz Aldrine");
		nasa.put(303, "Niel D'gras Tyson");
		nasa.put(104, "Stephan Hocking");
		
		System.out.println(nasa);
		
		// getting element
		System.out.println(nasa.get(101));
		
		// remove
		nasa.remove(101);
		System.out.println(nasa);
		
		// memberships
		if (nasa.containsKey(102)) {
			System.out.println("102 exits");
		}
		
		if (nasa.containsValue("Stephan Hocking")) {
			System.out.println("Stephan Hocking is present");
		}
		
		// Iteration
		Set<Integer> keySet = nasa.keySet();
		for (int eachKey : keySet) {
			System.out.println("Key :: " + eachKey + " Value :: " + nasa.get(eachKey));
		}
		// not so common 
		for(Map.Entry<Integer, String> eachEntry : nasa.entrySet()) {
			System.out.println(eachEntry.getKey() + " " + eachEntry.getValue());
		}
		
		System.out.println(nasa.size());
		
		nasa.clear();
		System.out.println(nasa);
	}

}
