package test_Ng_challenge;

import org.testng.annotations.Test;

public class Same_TC_RunX_Times {

	@Test(invocationCount = 15)
	public void GetMethod() {
		System.out.println("GetMethod 1");
	}
}
