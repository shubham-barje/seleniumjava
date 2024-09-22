package com.encapsulation;

public class CreateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Common cm = new Common();
//		int h = cm.height=10;
//		int l = cm.length=5;
//		int w = cm.width=5;
//	
		
		int h = cm.setHeight(0);
		int l = cm.setLength(0);
		int w = cm.setWidth(0);
		cm.setBoxDimenssions(l, h, w);
		
		//another way
		System.out.println(cm.getHeight(h)+" "+cm.getLength(l)+" "+cm.getWidth(w));
		

	}

}
