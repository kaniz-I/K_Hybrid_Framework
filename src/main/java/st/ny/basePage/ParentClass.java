package st.ny.basePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass { // setup ()
	public static Properties prop;
	public static WebDriver driver;
	public static FileInputStream fis;

	public ParentClass()  {
		try { // I need 2 classes to read file properties and FileInputdStream
			prop = new Properties(); // Java class and inside the java file
			fis = new FileInputStream("./src/main/java/st/ny/config/Config.properties");// config file copy
			
			prop.load(fis); // path
									//read any file text/ excel sheet/csv(FileInputStream)
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		public void intialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.automationexercise.com/login");

}


}
