package com.day9.com;

public class TestExceptionHandeling {

	public static void main(String[] args) {
		ExceptionHandeling objExceptionHandeling=new ExceptionHandeling();
		objExceptionHandeling.intCalculator(54, 0);
		
		System.out.println("\n===========================Null Pointer Exception============================\n");
		objExceptionHandeling.strUserDetails("Jhon", null, 974524811, "Maharashtra", "India");
		
		System.out.println("\n===========================ArrayIndex Out Of Bond Exception============================\n");
		
		objExceptionHandeling.arraysForCountry();
		
		System.out.println("\n===========================Number Format Exception============================\n");
		
		objExceptionHandeling.additionOfThree(50, 40);
		
		System.out.println("\n================================Multiple Catch Block================================\n");
		MultipleException objMultipleException=new MultipleException();
		objMultipleException.multipleException();
	}

}
