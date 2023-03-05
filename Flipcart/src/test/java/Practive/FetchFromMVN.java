package Practive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchFromMVN {
	public WebDriver driver;
	
	@Test
	public void BeforeClass() {
		System.out.println("Launching Browser");
		
		String Browser =System.getProperty("browser");
		String Url =System.getProperty("url");
			
		{
	if (Browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	else if(Browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else if(Browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	driver.get(Url);

		}
	}
	// 1st Pull From GitHub
	
	//2nd Pushed From Local Eclips
	
	// 3rd Pull From GITHUB
	
}
