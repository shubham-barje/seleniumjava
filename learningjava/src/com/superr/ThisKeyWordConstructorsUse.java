package com.superr;

public class ThisKeyWordConstructorsUse {

	int x;
	int y;
	
	public ThisKeyWordConstructorsUse() {
		System.out.println("No argument constructor");
	}
	
	public ThisKeyWordConstructorsUse(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
		System.out.println("No argument constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyWordConstructorsUse tkc = new ThisKeyWordConstructorsUse(3,3);
		tkc.getData();
	}
	public void getData() {
		System.out.println(x+y);
	}

}
