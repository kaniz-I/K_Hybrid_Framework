package test_Ng_challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Provider_Practice {
	
	
WebDriver driver;

@DataProvider(name ="Verification")

	public static Object[][] creditials (){			//another name authentication
		return new Object[][] 	{{"kanizislam.st@gmail.com","abcd1234"},
								{"kanizislam.st@kmail.com", "abcdf234"},
								{"kanizislam.st@gmail.com", "abcc1534"}};
	
}
@Test (dataProvider ="Verification")
public void getSignIn(String Username, String Password) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.navigate().to("https://www.automationexercise.com/login");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(Username);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password); 
	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	
	
}
@AfterMethod 
public void tear() throws InterruptedException{
	Thread.sleep(3000);
	driver.quit();
}	
}
