package com.abs;

public class Square extends Shapes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square();
		sq.colorShape();
		sq.moveShape();
		sq.drawShape();

	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("DrawSquare");
		
	}

	@Override
	public void colorShape() {
		System.out.println("ColorSquare");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveShape() {
		// TODO Auto-generated method stub
		System.out.println("MoveSquare");
		
	}

}
