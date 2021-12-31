package com.h2kinfosys.learn.day09;

public class DistributionCenter {
	
	protected String zipCode;
	
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public DistributionCenter(String zipCode) {
		System.out.println("DistributionCenter Constructor :: " + zipCode);
		this.zipCode = zipCode;
	}

}
