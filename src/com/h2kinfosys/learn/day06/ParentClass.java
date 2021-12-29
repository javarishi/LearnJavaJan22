package com.h2kinfosys.learn.day06;

public class ParentClass {
	
	public ParentClass(String name) {
		System.out.println("Parent Class no-arg Constructor :: " + name);
	}

	private String privateString = "Parent Private String";
	String defaultString = "Parent Default String";
	protected String protectedString = "Parent protected String";
	public String publicString = "Parent public String";
	
	
	public void testParentPublic() {
		System.out.println("This is Public Method from Parent");
	}
	
	protected void testParentProtected() {
		System.out.println("This is Protected Method from Parent");
	}
	
	void testParentDefault() {
		System.out.println("This is Default Method from Parent");
	}
	
	public int testReusableLogic() {
		System.out.println("Parents Reusable Logic method ");
		return 100;
	}
}
