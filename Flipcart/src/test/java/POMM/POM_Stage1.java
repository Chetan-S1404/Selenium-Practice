package POMM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Stage1 {
	//declaration
@FindBy (id="loginbutton")
private WebElement loginbtn;

//Initialization
public POM_Stage1 (WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

 //Implementation
public void click() {
	loginbtn.click();
}
}
