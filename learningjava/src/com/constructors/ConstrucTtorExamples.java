package com.constructors;

public class ConstrucTtorExamples {
	//no return type and same name as the class name
	
	public ConstrucTtorExamples() {
		System.out.println("No argument Constructor");
	}

	
	public ConstrucTtorExamples(int a,int b) {
		System.out.println("Parametrized Constructor");
	}

	
	public ConstrucTtorExamples(String s) {
		System.out.println("String parametrized Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrucTtorExamples ce = new ConstrucTtorExamples("Shubh");//Default constructor

	}

}
