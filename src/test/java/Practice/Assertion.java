package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
 /* @Test
	public void assertion() {
		System.out.println("step1");
		System.out.println("step2");
		//Assert.assertEquals(true, true);
		
		Assert.assertEquals(false, true);
		System.out.println("step3");
		System.out.println("step4");
		
	}
  @Test
  public void assertion1() {
	  System.out.println("step5");
	  System.out.println("step6");
  }*/
	@Test
	public void createuser() {
		String act= "siva";
		String exp="siva";
		Assert.assertEquals(act,exp);
	}
	
}
