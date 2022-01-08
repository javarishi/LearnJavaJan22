package com.h2kinfosys.learn.day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileCharacters {

	public static void main(String[] args) throws IOException {
		String path = "/RISHI/H2K/FileIO/demofile.txt";
		String write_path = "/RISHI/H2K/FileIO/demofile_output.txt";
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader(path);
			writer = new FileWriter(write_path);
			int ch =0;
			// -1 is end of file
			while((ch = reader.read()) != -1) {
				writer.write(ch);
			}
			System.out.println("Done!");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			reader.close();
			writer.close();
		}

	}

}
