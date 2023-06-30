package test_Ng_challenge;

import org.testng.annotations.Test;

public class Depends_OnMethod {
// 											In syso inside""  must have same method()name ex: getLogIn   
//											syso "getLogIn" if I put syso "LogIn" it will be an error

	@Test(dependsOnMethods = "getOpenBrowser")
	public void getLogIn() {

		System.out.println("getLogIn");

	}

//	@Test(dependsOnMethods = "getLogIn")
	public void getCloseBrowser() {

		System.out.println("getCloseBrowser");

	}

	 @Test
	public void getOpenBrowser() {

		System.out.println("getOpenBrowser");

	}

}
