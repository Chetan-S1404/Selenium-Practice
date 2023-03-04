package Test_NG;

import org.testng.annotations.Test;

public class Conc_Dependson {
	@Test 
	public void createcontact() {
		System.out.println("createcontact");
	}

	@Test(dependsOnMethods = "createcontact")
	public void modifycontact() {
		System.out.println("modifycontact");
	}
		
	@Test(dependsOnMethods = "modifycontact")
	public void deletecontact() {
		System.out.println("deletecontact");
	}	
}
