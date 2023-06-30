package test_Ng_challenge;

import org.testng.annotations.Test;

public class Priority_Practice { // how tc will executed? alphabecitally

	@Test(priority = 0)
	public void GetMethod01() {
		System.out.println("1st Method()");
	}

	@Test(priority = 7)
	public void GetMethod02() {
		System.out.println("2nd Method()");
	}

	@Test(priority = 0)
	public void GetMethod03() {
		System.out.println("3rd Method()");
	}

	@Test(priority = 2)
	public void GetMethod04() {
		System.out.println("4th Method()");
	}

	@Test(priority = 7)
	public void GetMethod05() {
		System.out.println("5th Method()");
	}

	@Test(priority = 2)
	public void GetMethod06() {
		System.out.println("6th Method()");
	}

	@Test(priority = 0)
	public void GetMethod07() {
		System.out.println("7th Method()");
	}

	@Test(priority = 3)
	public void GetMethod08() {
		System.out.println("8th Method()");
	}

}
