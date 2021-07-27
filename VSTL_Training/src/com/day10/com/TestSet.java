package com.day10.com;

public class TestSet {

	public static void main(String[] args) {
		SetExample objSetExample =new SetExample();
		objSetExample.setMycart();
		objSetExample.setIteretor();
		objSetExample.cartInsertionOrder();
		
		
		System.out.println("\n==============================Duplicate Entries by the user===========================\n");
		DuplicateEntries objDuplicateEntries =new DuplicateEntries();
		objDuplicateEntries.duplicatesEntriesOfUser();

	}

}
