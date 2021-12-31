package com.h2kinfosys.learn.day09;

public class Store extends DistributionCenter{

	
	public Store() {
		super("TEST");
		System.out.println("Simple Logic for Creating a Store Object");
	}
	
	public Store(String storeNumber) {
		this();
		System.out.println("Store Number Logic for Creating a Store Object :: " + storeNumber);
	}
	
	public Store(String storeNumber, String zipCode) {
		this(storeNumber);
		this.zipCode = zipCode;
		System.out.println("ZipCode attached to Store");
	}
	
	public static void main(String[] args) {
		Store str = new Store("0121", "30080");
		System.out.println(str.getZipCode());
	}
}
