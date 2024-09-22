package com.readData;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteDataDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Create an object of FileWriter Class
		FileWriter fw = new FileWriter("D:\\java_selenium\\ReadAndWrite\\src\\com\\properties\\TestData.properties",true);
		FileOutputStream fos = new FileOutputStream("D:\\java_selenium\\ReadAndWrite\\src\\com\\properties\\TestData.properties");
		
		//Create an object of properties class
		Properties p = new Properties();
		
		//Use set property method to set property
		 p.setProperty("url", "www.yahoo.com");
		 p.store(fos, "first comment fos");
	}

}
