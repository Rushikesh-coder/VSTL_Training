package com.day9.com;

public class ExceptionHandeling {

	public void intCalculator(int intNumber1, int intNumber2) {
		int intResult;
		intResult = intNumber1 + intNumber2;
		System.out.println("Result of Addition of " + intNumber1 + " and " + intNumber2 + " : " + intResult + "\n");

		try {
			intResult = intNumber1 / intNumber2;
			System.out.println("Result of Division of " + intNumber1 + " and " + intNumber2 + " : " + intResult + "\n");
		}

		catch (ArithmeticException arithmaticException) {
			System.out.println(arithmaticException);
			arithmaticException.printStackTrace();
		}

		intResult = intNumber1 - intNumber2;
		System.out.println("Result of Substraction of " + intNumber1 + " and " + intNumber2 + " : " + intResult + "\n");
		intResult = intNumber1 * intNumber2;

		System.out.println("Result of Multiplication of " + intNumber1 + " and " + intNumber2 + " : " + intResult + "\n");

	}

	public void strUserDetails(String strName, String strCity, int intPhone, String strState, String strCountry) {
		System.out.println("Name of a User : " + strName + "Size : " + strName.length());
		System.out.println("Phone Number of a User : " + intPhone);
		try {
			System.out.println("City of a User : " + strCity + "Size : " + strCity.length());
		} catch (NullPointerException nullPointerException) {

			System.out.println(nullPointerException);
			nullPointerException.printStackTrace();
		}

		System.out.println("State of a User : " + strState + "Size : " + strState.length());
		System.out.println("City of a User : " + strCountry + "Size : " + strCountry.length());

	}

	public void arraysForCountry() {
		int intCountryCode[] = { 91, 1, 44, 61, 7, 94 };
		try {
			for (int intIndex = 0; intIndex < 7; intIndex++) {
				System.out.println("Country Code : " + intCountryCode[intIndex]);
			}

		} catch (ArrayIndexOutOfBoundsException arrayIndexException) {

			System.out.println(arrayIndexException);
			arrayIndexException.printStackTrace();
		}
		String strCountryName[] = { "India", "USA", "UK", "Austrelia", "Russia", "Shri Lanka" };
		for (int intIndex = 0; intIndex < 6; intIndex++) {
			System.out.println("Country Name : " + strCountryName[intIndex]);
		}

	}
	
	public void additionOfThree(int intNumber1, int intNumber2)
	{
		try {
			String strNumber="144dABC";
			int intResult=intNumber1+intNumber2+Integer.parseInt(strNumber);
			System.out.println(intResult);
		} 
		catch (NumberFormatException numberFormatException) {
			System.out.println(numberFormatException);
			numberFormatException.printStackTrace();
		}
		catch (Exception exception) {
			System.out.println("*********Addition Not Possible************"+exception.getMessage());
			exception.printStackTrace();
		}
		
	}

}
