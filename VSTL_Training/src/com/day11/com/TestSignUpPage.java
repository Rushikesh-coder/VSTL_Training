package com.day11.com;

public class TestSignUpPage {

	public static void main(String[] args) {
		
		SignUpFlow objSignUpFlow=new SignUpFlow();
		objSignUpFlow.doSignUp();
		objSignUpFlow.verifyHomePageIsVisible();
		
		

	}

}
