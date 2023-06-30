package testng.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser_Practice {

	WebDriver driver;

	@BeforeMethod // annotation before executing prerequestie??
	@Parameters("Browser")

	public void SearchEngine(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println(" This Search Engine is coming from Chrome ");
		} else if (browser.equalsIgnoreCase("FireFox"))

		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println(" This Search Engine is coming from FireFox ");
		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println(" This Search Engine is coming from Edge");
		} else if (browser.equalsIgnoreCase("opeRa")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			System.out.println(" This Search Engine is coming from opeRa ");
		}
	}

	@Test
	public void LogInSite() {
driver.navigate().to("https://www.zoho.com/");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.findElement(By.xpath("//*[@class='login'] ")).click();

	}

}
