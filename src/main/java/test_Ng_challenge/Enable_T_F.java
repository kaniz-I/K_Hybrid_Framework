package test_Ng_challenge;

import org.testng.annotations.Test;

public class Enable_T_F {		//only true will execute and failed will go

	@Test(enabled = false)
	public void GetMethod01() {
		System.out.println("1st Method()");
	}

	@Test(enabled = true)
	public void GetMethod02() {
		System.out.println("2nd Method()");
	}

	@Test(enabled = false)
	public void GetMethod03() {
		System.out.println("3rd Method()");
	}

	@Test(enabled = true)
	public void GetMethod04() {
		System.out.println("4th Method()");
	}

	@Test(enabled = false)
	public void GetMethod05() {
		System.out.println("5th Method()");
	}

	@Test(enabled = true)
	public void GetMethod06() {
		System.out.println("6th Method()");
	}

	@Test(enabled = false)
	public void GetMethod07() {
		System.out.println("7th Method()");
	}

	@Test(enabled = true)
	public void GetMethod08() {
		System.out.println("8th Method()");
	}

}
