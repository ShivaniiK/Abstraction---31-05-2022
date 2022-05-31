package com.AbstractClass;

public class PageFactory {
	
	public static CollegeLoginPage objCollegeLoginPage = null;
	
	
	public static String strUser = "Staff";
	
	public static CollegeLoginPage getobjCollegeLoginPage() {
		if(strUser.equals("Student")) {
			objCollegeLoginPage = new StudentLoginPage();
		} else if(strUser.equals("Staff")) {
			objCollegeLoginPage = new StaffLoginPage();
		}
		return objCollegeLoginPage;
		}
		
	}
