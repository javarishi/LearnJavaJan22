package com.h2kinfosys.learn.day12;

import java.io.Serializable;

public class Employee implements Serializable{
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	String empId;
	String empName;
	String empAddress;

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}
