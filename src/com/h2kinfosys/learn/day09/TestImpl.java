package com.h2kinfosys.learn.day09;

public class TestImpl {

	public static void main(String[] args) {
		
		Callable storeManager = new Callable() {
			
			@Override
			public void validatePhoneNumber(String otp) {
				System.out.println("Phone Number validation with OTP");
				
			}
		};
		
		storeManager.validatePhoneNumber("230493");
	}

}
