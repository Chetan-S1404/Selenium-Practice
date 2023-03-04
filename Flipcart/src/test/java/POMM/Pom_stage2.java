package POMM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom_stage2 {
			@Test
		public void Pom() throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
		
		POM_Stage1 s1=new POM_Stage1(driver);
		s1.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		s1.click();/// not through any exceptins
		
	}
	
}
