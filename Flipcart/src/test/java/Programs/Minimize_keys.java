package Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Minimize_keys {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_ALT);
		 r.keyPress(KeyEvent.VK_SPACE);
		 r.keyPress(KeyEvent.VK_N);
		 Thread.sleep(2000);
		 r.keyRelease(KeyEvent.VK_ALT);
		 r.keyRelease(KeyEvent.VK_SPACE);
		 r.keyRelease(KeyEvent.VK_N);
	}

}
