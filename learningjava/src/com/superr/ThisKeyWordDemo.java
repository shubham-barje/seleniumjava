package com.superr;

public class ThisKeyWordDemo {

	int x = 3;
	int y = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyWordDemo tk = new ThisKeyWordDemo();
		tk.getData();

	}
	public void getData() {
		//For access the global variable
		int x= 7;
		int y = 8;
		System.out.println(this.x+this.y);
		System.out.println(x+y);
		this.getData1();
	}
	
	public void getData1() {
		//For call the method 
		int x= 7;
		int y = 8;
		System.out.println(x+y);
	}
	
	

}
