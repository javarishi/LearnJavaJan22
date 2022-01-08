package com.h2kinfosys.learn.day12;

import java.io.File;
import java.io.IOException;

public class FileObject {

	public static void main(String[] args) {
		String path = "/RISHI/H2K/FileIO/demofile_new.txt";
		try {
			File demoFile = new File(path);
			if(demoFile.exists()) {
				System.out.println("File Do Exists!");
			}else {
				demoFile.createNewFile();
				System.out.println("New File Is Created");
			}
			System.out.println("demoFile.canExecute() :: " + demoFile.canExecute());
			System.out.println("demoFile.canWrite() :: " +demoFile.canWrite());
			System.out.println("demoFile.canRead() :: " +demoFile.canRead());
			
			System.out.println("demoFile.getPath() :: " +demoFile.getPath());
			System.out.println("demoFile.getAbsolutePath() :: " + demoFile.getAbsolutePath());
			System.out.println("demoFile.getCanonicalPath() :: " + demoFile.getCanonicalPath());
			
			String parent = demoFile.getParent();
			System.out.println("demoFile.getParent() :: " +parent);
			
			File parentDir = new File(parent);
			
			if(parentDir.isDirectory()) {
				System.out.println("Yes! Its a Directory");
				System.out.println(parentDir.getFreeSpace());
				System.out.println(parentDir.getTotalSpace());
			}
			
			for(String eachFileName : parentDir.list()) {
				if(eachFileName.indexOf(".csv") != -1) {
					System.out.println(eachFileName);
				}
			}
			
			
			
			File newDir = new File(parentDir+"/temp_Rishi");
			if(newDir.exists()) {
				System.out.println("Directory Already Exists");
				newDir.delete();
			}else {
				boolean isCreated = newDir.mkdir();
				System.out.println("Directory Created " + isCreated);
			}
			
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
