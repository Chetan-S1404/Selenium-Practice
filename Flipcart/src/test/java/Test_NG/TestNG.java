package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {
@Test

public void pro() {
	Reporter.log("2", true);
}
@Test
public void  dee() {
	Reporter.log("1", true);
}
}
