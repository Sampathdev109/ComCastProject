package com.comcast.Contact;

import org.testng.annotations.Test;

public class LeadTest {

	@Test(groups = "SmokeTest")
	public void leadTest() {
		
		System.out.println("Execute CreateContactTest");
		
	}
	@Test(groups = "RegressionTest")
	public void LeadwithOrgTest() {
		
		System.out.println("Execute contactwithOrgTest");
	}
	@Test(groups = "RegressionTest")
	public void LeadwithoutOrgTest() {
	System.out.println("Execute deleteContactTest");
}
}
