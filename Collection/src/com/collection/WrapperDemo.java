package com.collection;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5 ;
		//Wrappings
		Integer int1 = new Integer(i);//The Integer class wraps a value of the primitive type int in an object
		
		System.out.print(int1);
		
		int j = int1;//UnWrapping
		System.out.println(j);
		

	}

}
