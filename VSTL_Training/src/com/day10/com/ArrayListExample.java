package com.day10.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public void userCart() {
		List<String> listOfCart = new ArrayList<>();

		listOfCart.add("TV");
		listOfCart.add("Fridge");
		listOfCart.add("AC");
		listOfCart.add("Cooler");
		listOfCart.add("Fan");
		listOfCart.add("Mobile");
		listOfCart.add("Cooler");
		listOfCart.add("Mobile");
		listOfCart.add("Woshing Machin");
		listOfCart.add("TV");
		listOfCart.add("Woshing Machin");

		System.out.println("My Cart Contain : " + listOfCart + "\n");
		System.out.println("Item on Third position : " + listOfCart.get(3) + "\n");
		System.out.println("Removed Item from Fift position : " + listOfCart.remove(4) + "\n");
		listOfCart.set(4, "Table Fan");
		System.out.println("Updeted List : " + listOfCart + "\n");

		Collections.sort(listOfCart);
		System.out.println("Sorted List : " + listOfCart + "\n");

		Collections.reverse(listOfCart);

		System.out.println("Reverced List : " + listOfCart + "\n");

	}
	
	public void userCartIteration()
	{
		List<String> listOfCart = new ArrayList<>();

		listOfCart.add("TV");
		listOfCart.add("Fridge");
		listOfCart.add("AC");
		listOfCart.add("Cooler");
		listOfCart.add("Fan");
		listOfCart.add("Mobile");
		listOfCart.add("Cooler");
		listOfCart.add("Mobile");
		listOfCart.add("Woshing Machin");
		listOfCart.add("TV");
		listOfCart.add("Woshing Machin");
		
		Iterator<String> itrMyCart =listOfCart.iterator();
		System.out.println("\n====================Iterating Element using Iteretor Interface========================\n");
		while(itrMyCart.hasNext())
		{
			System.out.println(itrMyCart.next());
		}
		
		
		System.out.println("\n===============================Iterating Elements using For Loop======================\n");
		
		for(int intIndex=0;intIndex<listOfCart.size();intIndex++)
		{
			System.out.println("Priority to Buy : "+(intIndex+1) +" Product in Cart : "+listOfCart.get(intIndex));
		}
		
	
		System.out.println("\n==========================Iterating Element using Enhance For loop=======================\n");
		for (String itrCart : listOfCart) {
			
			System.out.println("Product in Cart : "+itrCart);
		}
		
	}
}
