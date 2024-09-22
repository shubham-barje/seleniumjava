package com.readData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInTxtandCSV {

	public static void main(String[] args) throws IOException {
//		File f = new File("D:\\java_selenium\\ReadAndWrite\\src\\com\\properties\\TestDataTXT.txt");
		File f = new File("D:\\java_selenium\\ReadAndWrite\\src\\com\\properties\\TestDataCSV.csv");
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter(f);
		
		//Create BufferedWriter class
		BufferedWriter br = new BufferedWriter(fw);
		
		br.write("Hello Shubh"+" , ");
		
		br.close();

	}

}
