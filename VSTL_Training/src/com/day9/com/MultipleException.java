package com.day9.com;

public class MultipleException {

	public void multipleException() {
		try {
			
			String strNumber = "Number";
			int intSumOfTwo = 54 + Integer.parseInt(strNumber);
			System.out.println(intSumOfTwo);
			int intArray[] = new int[3];

			intArray[0] = 21;
			intArray[8] = 54;
			intArray[2] = 33;

			int result = 640 / 0;
			System.out.println(result);

			
		}
		catch (ArithmeticException arithmaticException) {
			System.out.println(arithmaticException);
			arithmaticException.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException arrayIndexException) {
			System.out.println(arrayIndexException);
			arrayIndexException.printStackTrace();
		}
		catch (Exception exception) {
			System.out.println("Exception Is Not Matching to any catch Block : "+exception.getMessage());
			exception.printStackTrace();
		}
		
		System.out.println("Other Code is Executing .......");
	}
}
