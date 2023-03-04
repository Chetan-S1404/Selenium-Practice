package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionss {
@Test
	public void As() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String act = driver.getTitle();
		System.out.println(act);
		String ver = "Log in to Facebook";
	//	Assert.assertEquals(act, ver, "test is passed");
		//Assert.assertEquals(act, ver);
		//System.out.println("test is passed");
		
		SoftAssert s=new SoftAssert();
		String ver1 = "sign up to Facebook";
		s.assertEquals(act, ver1);
		System.out.println("test is passed");
		s.assertAll();
	}

}
