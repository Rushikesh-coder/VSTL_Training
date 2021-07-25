package com.day8.com;

public class TypeCasting {
	public static void main(String[] args) {

		int intNumberFirst = 10;

		int intNumberSecond = 50;

		String strnumber = "40";

		int integerNumber = 540;

		double dblNumber = 40.58;

		int changednumber = Integer.parseInt(strnumber);
		System.out.println("typecasting to integer from String=" + strnumber);

		System.out.println(intNumberFirst + intNumberSecond + changednumber);

		double dblnumber_chenged = Double.parseDouble(strnumber);
		System.out.println("typecasting to double from string=" + dblnumber_chenged);

		int doubleToInt = (int) dblNumber;
		System.out.println(doubleToInt + ":- chenged to integer from double");

		long longNumber = Long.parseLong(strnumber);
		System.out.println("typecasting to Longinteger from string =" + longNumber);

		String usingValueOf = String.valueOf(integerNumber);
		System.out.println(usingValueOf + ":-  changed using valueOf methode");

		String usingtoString = Integer.toString(integerNumber); // tostring method is used only with Non primitive Data
																// types

		System.out.println(usingtoString + ":-  changed using toString methode");

		System.out.println("Assigning short value to byte");
		short shortNumber = 3454;
		byte bNumber = (byte) shortNumber; // Data Loss
		System.out.println("Before " + shortNumber + " After " + bNumber);

		System.out.println("Assigning short value to int");

		int shorttoint = shortNumber; // No Data loss
		System.out.println("Before " + shorttoint + " After " + shortNumber);

	}

}
