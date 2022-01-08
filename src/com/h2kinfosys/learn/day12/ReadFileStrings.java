package com.h2kinfosys.learn.day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileStrings {

	public static void main(String[] args) throws IOException {
		String path = "/RISHI/H2K/FileIO/demofile.txt";
		String write_path = "/RISHI/H2K/FileIO/demofile_strings.txt";

		BufferedReader bReader = null;
		BufferedWriter bWriter = null;
		try {
			bReader = new BufferedReader(new FileReader(path));
			bWriter = new BufferedWriter(new FileWriter(write_path));
			
			String line = null;
			
			while((line = bReader.readLine()) != null) {
				System.out.println(line);
				bWriter.write(line);
				bWriter.newLine();
			}
			
			System.out.println("Done!");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			bReader.close();
			bWriter.close();
		}

	}


}
