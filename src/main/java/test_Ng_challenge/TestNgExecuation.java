package test_Ng_challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgExecuation {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Open Browser");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Close Browser");
	}

	@Test
	public void test1() {

		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("kanizislam.st@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		System.out.println("test1");
	}

	@Test
	public void test2() {
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("kanizislam.st@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		System.out.println("test2");
	}

	@Test
	public void test3() {
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("kanizislam.st@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		System.out.println("test3");
	}
}
