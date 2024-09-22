package com.readData;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {

	// The Properties class represents a persistent set of properties. The Properties
//	can be saved to a streamor loaded from a stream. 
//	Each key and its corresponding value inthe property list is a string. 
	public static void main(String[] args) throws IOException {
	
		// Step 1: Create an object of FileReader class
		FileReader fr = new FileReader("D:\\java_selenium\\ReadAndWrite\\src\\com\\properties\\TestData.properties");
		FileInputStream fis = new FileInputStream("D:\\java_selenium\\ReadAndWrite\\src\\com\\properties\\TestData.properties");
		

		// Step 2: Create an object of properties class
		Properties p = new Properties();

		//Step 3: Load the file
		p.load(fr);
		p.load(fis);

		//Step 4: Use get property method to get property
		System.out.print(p.getProperty("name"));
	}

}
