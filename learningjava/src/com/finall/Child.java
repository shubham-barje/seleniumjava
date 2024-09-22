package com.finall;

public class Child extends Parent{
	public final int i = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		System.out.println(ch.i);
//		ch.i=15;
		System.out.println(ch.i);
		//we can call setData() but not override  it
		ch.setData();
	}
	//we cannot override setData() method
//	public void setData() {
//		System.out.println(i);
//	}
	

}
