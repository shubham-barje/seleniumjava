package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		//Add items to ArrayList
		al.add(10);
		al.add("Shubh");
		al.add(true);
		System.out.println(al.size());
		System.out.println(al);
		
		//Remove
		al.remove(0);
		System.out.println(al);
		
		al.add("Shubh");
		al.add(true);
		System.out.println(al);
		
		//Fetch => it fetch perticular value
		System.out.println(al.get(0));
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//forEach loop
		for(Object obj:al) {
			System.out.println(obj);
		}
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		Resizable-array implementation
//		of the List interface. Implementsall optional list operations, and permits all elements, including null. 
		ArrayList<Integer> alI = new ArrayList<Integer>();//allow only integer values concept known as Generic
		alI.add(12);
		int i =alI.get(0);
		System.out.println(i);
		
	}

}
