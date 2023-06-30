package test_Ng_challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import st.ny.basePage.ParentClass;

public class CrossBrowser_Test //extends ParentClass 
{

	WebDriver driver;	
	
@BeforeMethod
@Parameters("Browser")

public void setUp(String browser) {
	if(browser.equalsIgnoreCase("FireFox")) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
//		System.out.println("It opended on FireFox");
	}
	else if (browser.equalsIgnoreCase("ChroMe")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
//		System.out.println("It opended on ChroMe");
	}
	else if (browser.equalsIgnoreCase("eDgE")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
//		System.out.println("It opended on Edge");
	}
	else if (browser.equalsIgnoreCase("OPeRa")) {
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver(); 
//		System.out.println("It opended on Opera");
	}
	
}
	


@Test							// run  same TC in multilple browser
public void  SignIn() {
driver.get("https://www.automationexercise.com/login");
	driver.manage().window().maximize();
//	System.out.println("TaDa");
	
	driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("kanizislam.st@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd1234"); 
	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
}
@AfterMethod 
public void tearDown(){
	driver.quit();
}
		
	
}
