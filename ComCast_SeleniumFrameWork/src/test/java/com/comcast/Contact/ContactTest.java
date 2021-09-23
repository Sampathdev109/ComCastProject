package com.comcast.Contact;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups = "RegressionTest")
	public void contacttest() {
		
		System.out.println("Execute CreateContactTest");
		
	}
	@Test(groups = "SmokeTest")
	public void contactwithOrgTest() {
		
		System.out.println("Execute contactwithOrgTest");
	}
	@Test(groups = "RegressionTest")
	public void deleteContactTest() {
	System.out.println("Execute deleteContactTest");
}
}
