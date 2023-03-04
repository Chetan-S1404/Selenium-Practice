package Test_NG;

import org.testng.annotations.Test;

public class Con_Priority {
@Test(priority = 0)
public void createcontact() {
	System.out.println("createcontact");
}

@Test(priority = 1)
public void modifycontact() {
	System.out.println("modifycontact");
}
	
@Test(priority = 2)
public void deletecontact() {
	System.out.println("deletecontact");
}	
	
	
}
