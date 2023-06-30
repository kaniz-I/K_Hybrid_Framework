package test_Ng_challenge;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Practice {
@BeforeSuite	
public void getBeforeSuite() {
	System.out.println("Before Suite is 1st Run");
}
@BeforeTest
public void getBeforeTest() {
	System.out.println("Before Test is 2nd Run");
}
@BeforeClass
public void getBeforeClass() {
	System.out.println("Before Class is 3rd Run");
}
@BeforeMethod
public void getBeforeMethod() {
	System.out.println("Before Method is 4th Run");
}
@Test
public void getTest() {
	System.out.println("Test is 5th Run");
}
@AfterMethod
public void getAfterMethod() {
	System.out.println("After Method is 6th Run");
}
@AfterClass
public void getAfterClass() {
	System.out.println("After Class is 7th Run");
}
@AfterTest
public void getAfterTest() {
	System.out.println("After Test is 8th Run");
}
@AfterSuite
public void getAfterSuite() {
	System.out.println("After Suite is 9th Run");
}

}
