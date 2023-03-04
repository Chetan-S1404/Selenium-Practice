package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	
	WebDriver driver;	
	
@BeforeClass
public void lauchbrowser() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
}

@BeforeMethod
public void openapp() {
	driver.navigate().to("https://www.facebook.com/login/");
}

@Test
public void script() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("email");
	driver.findElement(By.id("pass")).sendKeys("passcode");
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(6000);
}
@AfterMethod
public void closeapp() throws Throwable {
	driver.close();
	Thread.sleep(4000);
	
}
@AfterClass void closebrowser() {
	driver.quit();
}
}
