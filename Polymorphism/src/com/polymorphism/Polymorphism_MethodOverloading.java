package com.polymorphism;

public class Polymorphism_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_MethodOverloading pm = new Polymorphism_MethodOverloading();
		pm.login("shubh", "Chembur");
		pm.login(30102003, 2613);

	}
	
	//in this we change the parameters 
	public void login(String name,String address) {
		System.out.println("We accept the name and address for login");
	}
	
	public void login(int ID,String name) {
		System.out.println("We accept the ID and name for login");
	}
	
	public void login(int ID,int password) {
		System.out.println("We accept the ID and password for login");
	}



}
