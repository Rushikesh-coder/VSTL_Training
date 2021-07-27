package com.day10.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicateEntries {

	public void duplicatesEntriesOfUser()
	{
		List<String> listOfUser = new ArrayList<>();

		listOfUser.add("John");
		listOfUser.add("Jatin");
		listOfUser.add("Jack");
		listOfUser.add("Rupam");
		listOfUser.add("Rushikesh");
		listOfUser.add("Rohan");
		listOfUser.add("Mahesh");
		listOfUser.add("Aniket");
		listOfUser.add("Ishant");
		listOfUser.add("Aniket");
		listOfUser.add("Rakesh");
		listOfUser.add("Jack");
		listOfUser.add("Mahesh");
		listOfUser.add("Rakesh");
		listOfUser.add("Rushikesh");
		for(int i=0;i<listOfUser.size();i++)
		{
			for(int j=i+1;j<listOfUser.size();j++)
			{
				if(listOfUser.get(i).equals(listOfUser.get(j)))
				{
					System.out.println("Duplicate user Entrie : "+listOfUser.get(i)+"\n");
				}
			}
		}
		
		
		Set<String> setUpdetedEntries=new HashSet<>(listOfUser);
		Iterator<String> itr=setUpdetedEntries.iterator();
		
		System.out.println(" Updated Entries of the Users ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
	
}
