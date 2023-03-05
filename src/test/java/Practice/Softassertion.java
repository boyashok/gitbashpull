package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion {
    @Test
    public void createassert() {
    	System.out.println("step1");
    	System.out.println("step2");
    	SoftAssert st= new SoftAssert();
    	st.assertEquals(true,true);
    	System.out.println("step3");
    	System.out.println("step4");
    }
    @Test
    public void modifyassert() {
    	System.out.println("step5");
    	System.out.println("step6");
    } 
	    
	
}
