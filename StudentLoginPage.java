package com.AbstractClass;

public class StudentLoginPage extends CollegeLoginPage {

	public void doLogin(String strUsername, String strPassword, String strDepartment, String strMobileNumber) {     //Override
		System.out.println("Enter you Username : "+strUsername);
		System.out.println("Enter you Password : "+strPassword);
		System.out.println("Enter you Department : "+strDepartment);
		System.out.println("Enter you Mobile Number : "+strMobileNumber);
	}
}
