package com.encapsulation;

public class Common {
	private int length;
	private int height;
	private int width;
	
	public void setBoxDimenssions(int l,int h,int w) {
		if(l>=1 && h>=1 && w>=1) {
			System.out.println("The created box dimmenssion is"+l+" "+h+" "+w);
		}
		else {
			System.out.println("Invalid");
		}
		
	}
	
	//Getter
	public int getLength(int l) {
		if(l>=1) {
			length = l;
		}
		else {
			System.out.println("invalid");
		}
		
		return length;
	}
	public int getHeight(int h) {
		height = h;
		return height;
	}
	public int getWidth(int w) {
		width = w;
		return width;
	}
	
	//Setter
	public int setLength(int l) {
		return l;
	}
	public int setHeight(int h) {
		return h;
	}
	public int setWidth(int w) {
		return w;
	}
}
