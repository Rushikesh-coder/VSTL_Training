package com.day10.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
	public void setMycart()
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
		
		System.out.println("\nList containing Duplicate items : " +listOfCart+"\n");
		
		Set<String> setListOfCart=new HashSet<>(listOfCart);
		System.out.println("List after removing Duplicate items : "+setListOfCart+"\n");
	}
	
	public void setIteretor()
	{
		Set<String> listOfCart = new HashSet<>();

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
		
		Iterator<String> itrCart=listOfCart.iterator();
		
		while(itrCart.hasNext())
		{
			System.out.println(itrCart.next());
		}
	}
	
	public void cartInsertionOrder()
	{
		Set<String> listOfCart =new LinkedHashSet<>();
		
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
		
		System.out.println("\n======================== Mentaning the insertion order ===========================\n");
		Iterator<String> itrCart =listOfCart.iterator();
		
		while(itrCart.hasNext())
		{
			System.out.println(itrCart.next());
		}
	}
	
}
