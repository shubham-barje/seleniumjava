package com.polymorphism;

public class Cat extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.makeNoise();

	}
	//For method overriding parameter or signature and method will must have to be same otherwise method is not override another 
	public void makeNoise() {
		System.out.println("Cat Mewoooooooo");
	}

}
