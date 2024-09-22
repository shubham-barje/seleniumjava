package com.abs;

public class Circle extends Shapes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.drawShape();
		c.moveShape();
		c.colorShape();

	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("DrawCircle");
		
	}

	@Override
	public void colorShape() {
		// TODO Auto-generated method stub
		System.out.println("ColorCircle");
	}

	@Override
	public void moveShape() {
		// TODO Auto-generated method stub
		System.out.println("MoveCircle");
	}
	
	

}
