package test_Ng_challenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




//no issue
public class CrossBrowserTest_PracticeFirst {

	WebDriver driver;

	@BeforeMethod
	public void getOpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("The browser will open");
	}

	@AfterMethod
	public void getCloseBrowser() {
		driver.quit();
		System.out.println("The browser will close and server aswell");
	}

	@Test		//is it possible to do webelement here instead of driver??
	public void getLogIn() {
		driver.navigate().to("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("The browser opened Automation Exercise Website");

	}

}
