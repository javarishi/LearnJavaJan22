package com.h2kinfosys.learn.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject {

	public static void main(String[] args) {
		Employee empOne = new Employee();
		empOne.setEmpName("Niel Armstrong");
		empOne.setEmpId("100");
		empOne.setEmpAddress("100 Moon Land Parkway");
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/RISHI/H2K/FileIO/empObj.obj"));
			ObjectInputStream inObj = new ObjectInputStream(new FileInputStream("/RISHI/H2K/FileIO/empObj.obj"));
			
			out.writeObject(empOne);
			System.out.println("Object Writing is complete");
			
			Employee emp = (Employee) inObj.readObject();
			
			System.out.println(emp.getEmpId() + " " + emp.getEmpName() + " " + emp.getEmpAddress());
			
			out.close();
			inObj.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
