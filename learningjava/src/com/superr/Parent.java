package com.superr;

public class Parent {
	
	public Parent() {
		System.out.println("Parent constructor");
	}
	
	public Parent(int a ) {
		System.out.println("int Parent constructor");
	}
	
	String name = "Shubh";
	int number = 04 ;
	
	public void getData() {
		System.out.println(name);
		System.out.println(number);
	}
}
