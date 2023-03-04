package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Conc_Enabled {
	@Test 
	public void createcontact() {
		System.out.println("createcontact");
	}

	@Test(enabled = false)
	public void modifycontact() {
		System.out.println("modifycontact");
	}
	@Test
	public void pro() {
		Reporter.log("2", true);
	}
	@Test(invocationCount = 0)
	public void  dee() {
		Reporter.log("1", true);
	}
}
