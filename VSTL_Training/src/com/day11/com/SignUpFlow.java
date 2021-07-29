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

	public void doSignUp() {

		strTestData = objUtility.signUpTestData().get("FirstName")+objUtility.randomName(4);
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setName(strTestData);

		}

		strTestData = objUtility.signUpTestData().get("LastName")+objUtility.randomName(4);
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setLastName(strTestData);
		}

		strTestData = objUtility.signUpTestData().get("MobileNumber")+objUtility.randomNumber();
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setMobileNumber(strTestData);
		}

		strTestData = objUtility.signUpTestData().get("Password");
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setPassword(strTestData);
		}

		strTestData = objUtility.signUpTestData().get("Date")+objUtility.randomDate();
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setDate(strTestData);
		}

		strTestData = objUtility.signUpTestData().get("Gender");
		if (!strTestData.equals("")) {
			objFaceBookSignUpPage.setGender(strTestData);
		}

		objFaceBookSignUpPage.clickSignUpButton();

	}

	public void verifyHomePageIsVisible() {
		String strExpectedData = objFaceBookHomePage.getLogOutText();

		strTestData = objUtility.signUpTestData().get("HomePage");

		if (strExpectedData.equals(strTestData)) {
			System.out.println("LogOut Button is visible");
			System.out.println("Test Passed");

		} else {
			System.out.println("LogOut Button is not visible");

			System.out.println("Test failed");
		}
	}
}
