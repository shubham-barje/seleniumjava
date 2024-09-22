package com.trycatch;

public class TryCatchDemo {

	public static void main(String[] args) {
		//The Throwable class is the superclass of all errors and exceptions in the Java 
		try {
			int i = 10;
			System.out.println("Before division");
			System.out.println(i/0);
		}
		catch(Throwable t) {
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			System.out.println(t.getStackTrace());
			t.printStackTrace();
		}
	}
}
