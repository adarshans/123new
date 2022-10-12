package naloor;

import org.testng.annotations.Test;

import genericlbrary.Baseclass;
import pompages.skilraryloginpage;

public class testcase1 extends Baseclass {
	@Test
	public void tc1() throws InterruptedException {
		skilraryloginpage sl=new skilraryloginpage(driver);
		sl.skilgear();
		Thread.sleep(3000);
		sl.skildemo();
		
	}

}
