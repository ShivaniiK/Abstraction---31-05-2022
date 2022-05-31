package com.AbstractClass;

public class TestAbstract {

	public static void main(String[] args) {
		
		PageFactory.getobjCollegeLoginPage().doLogin("Neha", "Star456", "Civil","9532758365");
		System.out.println("====================================");
		PageFactory.getobjCollegeLoginPage().doLogin("Pooja", "India123", "Production", "8460274836");
		System.out.println("====================================");
		PageFactory.getobjCollegeLoginPage().collegeNameToDisplay();
	}

}
