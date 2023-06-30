package test_Ng_challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paralell_TestPractice {
	WebDriver driver; 
	
	@Test
	public void SmokeTest() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.zoho.com/index1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//div[@class='icon-yahoo_small fedicon yahooicon']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("blanc2hope");
		// driver.findElement(By.xpath("//input[@name='persistent']")).click();
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("abcd1234!@#$");
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		driver.findElement(By.xpath("//button[@name='agree']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		System.out.println(" Zoho SmokeTest node1 ");
		}
	@Test
	public void SanityTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.zoho.com/index1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//div[@class='icon-yahoo_small fedicon yahooicon']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("blanc2hope");
		// driver.findElement(By.xpath("//input[@name='persistent']")).click();
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("abcd1234!@#$");
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		driver.findElement(By.xpath("//button[@name='agree']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		System.out.println(" Zoho SanityTest node2 ");
				
		}
	@Test
	public void FunctionalTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.zoho.com/index1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//div[@class='icon-yahoo_small fedicon yahooicon']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("blanc2hope");
		// driver.findElement(By.xpath("//input[@name='persistent']")).click();
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("abcd1234!@#$");
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		driver.findElement(By.xpath("//button[@name='agree']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		System.out.println(" Zoho FunctionalTest node3 ");
		
	}


	@Test
	public void RegressionTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.zoho.com/index1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//div[@class='icon-yahoo_small fedicon yahooicon']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("blanc2hope");
		// driver.findElement(By.xpath("//input[@name='persistent']")).click();
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("abcd1234!@#$");
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		driver.findElement(By.xpath("//button[@name='agree']")).click();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println(" Zoho RegressionTest node4 ");
		Thread.sleep(3000);

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}


	}

