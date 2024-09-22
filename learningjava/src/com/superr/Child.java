package com.superr;

public class Child extends Parent {
	
	//call the constructor from parent 
	public Child() {
//		super();
		super(3);
	}
	
	String name = "Shubh123";
	int number = 0444 ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		ch.getData();
	}
	public void getData() {
		super.getData();//super get the parent data
		
		System.out.println(name);
		System.out.println(number);
		
		System.out.println(super.name);
		System.out.println(super.number);
	}

}
