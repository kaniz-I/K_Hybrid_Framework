package test_Ng_challenge;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed_TC {


@Test 
public void getTestOne () {
		System.out.println("getTestOne");
		Assert.assertTrue(false);
}
@Test 	
public void getTesttwo () {
	System.out.println("getTesttwo");
	Assert.assertTrue(true);
}
@Test 
public void getTestthree () {
	System.out.println("getTestthree");
	Assert.assertTrue(true);	
}
@Test 
public void getTestfour() {
	System.out.println("getTestfour");
	Assert.assertTrue(true);	
}
@Test 
public void getTestfive () {
	System.out.println("getTestfive");
	Assert.assertTrue(false);
}
@Test 
public void getTestsix () {
	System.out.println("getTestsix");
	Assert.assertTrue(true);
}

}
