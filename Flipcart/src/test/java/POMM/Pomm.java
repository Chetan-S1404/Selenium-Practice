package POMM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pomm {
	@Test
	public void As() throws Throwable {
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement web = driver.findElement(By.id("loginbutton"));
	web.click();
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().refresh();
	Thread.sleep(4000);
	
	web.click();//unable to click twice in same element getting FAILED: As
	//org.openqa.selenium.StaleElementReferenceException:stale element reference: element is not attached to the page document
}
}