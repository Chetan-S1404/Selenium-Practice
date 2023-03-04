package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitTime {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("nav-global-location-popover-link"));// it will work fro findelemet/s only
		ele.click();
		
	
		String x = ele.getCssValue("font");
		System.out.println(x);
	}

}
