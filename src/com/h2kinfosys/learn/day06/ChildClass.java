package com.h2kinfosys.learn.day06;
// Parent Class - base Class, super class
// Child Class - sub class, 

public class ChildClass extends ParentClass{
	
	public ChildClass() {
		super("Tester");
		System.out.println("Child Class no-arg Constructor");
	}
	
	public void testChildClassMethod() {
		System.out.println("This is Child CLass Method");
	}
	
	
	public int testReusableLogic() {
		int var = super.testReusableLogic();
		System.out.println("Child's Reusable Logic method ");
		return var;
	}
	

}
