package com.inhritence;

public class Truck extends VehicleCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Truck tk = new Truck();
		tk.start();
		tk.stop();
	}
	
	public void CheckLoadCapacity() {
		System.out.println("10 Ton Capacity");
	}

}
