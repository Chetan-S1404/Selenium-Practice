package Programs;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Throwable, IOException{
		
		//public void scren() throws InterruptedException, IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7411852228");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		Random r=new Random();
		int ran = r.nextInt(1000);
		
		File loc=new File("C:\\Users\\chetan\\git\\repository\\Flipcart\\test-output\\Screenshot\\FaceBook"+ran+".png");
		FileUtils.copyFile(src, loc);
		//FileUtils.copyFile(src, loc);
		driver.quit();
		System.out.println("Screenshot saved As  ----> FaceBook"+ran+".png");
		System.out.println("--------------------------------");
		}
		

}
