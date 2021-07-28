package com.day11.com;

public class SignUpFlow {

	private FaceBookSignUpPage objFaceBookSignUpPage;
	private FaceBookHomePage objFaceBookHomePage;
	private Utility objUtility;
	String strTestData = "";

	public SignUpFlow() {

		objFaceBookSignUpPage = new FaceBookSignUpPage();
		objFaceBookHomePage = new FaceBookHomePage();
		objUtility = new Utility();

	}
	int intIndex=0;
	public void doSignUp() {

		
		strTestData = objUtility.signUpTestData().get("FirstName");
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setName(strTestData);
			
		} else {
			System.out.println("Empty fields ");
			intIndex++;
		}

		strTestData = objUtility.signUpTestData().get("LastName");
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setLastName(strTestData);
		} else {
			System.out.println("Empty field ");
			intIndex++;
		}

		strTestData = objUtility.signUpTestData().get("MobileNumber");
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setMobileNumber(strTestData);
		} else {
			System.out.println("Empty field");
			intIndex++;
		}

		strTestData = objUtility.signUpTestData().get("Password");
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setPassword(strTestData);
		} else {
			System.out.println("Empty field");
			intIndex++;
		}

		strTestData = objUtility.signUpTestData().get("Date");
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setDate(strTestData);
		} else {
			System.out.println("Empty field ");
			intIndex++;
		}
		
		strTestData = objUtility.signUpTestData().get("Gender");
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setGender(strTestData);
		} else {
			System.out.println("Empty field ");
			intIndex++;
		}

		objFaceBookSignUpPage.clickSignUpButton();

	}

	public void verifyHomePageIsVisible() {
		String strExpectedData = objFaceBookHomePage.getLogOutText();
		
		strTestData = objUtility.signUpTestData().get("HomePage");
		
		if (strExpectedData.equals(strTestData) && intIndex==0) {
			System.out.println("LogOut Button is visible");
			System.out.println("Test Passed");

		} else {
			System.out.println("LogOut Button is not visible");
			
			System.out.println("Test failed");
		}
	}
}
