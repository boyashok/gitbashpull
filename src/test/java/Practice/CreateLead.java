package Practice;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
@Listeners(GenericUtility.ListnerImplementation.class)
public class CreateLead extends BaseClass {
     @Test(retryAnalyzer=GenericUtility.RetryImpClass.class)
	//@Test(groups={"smoke","regression"})
	public void createlead() throws IOException, InterruptedException {
      
	/*String key= "webdriver.edge.driver";
		String value="C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty(key, value);
		EdgeDriver driver = new EdgeDriver();*/
	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
		WebElement product1=driver.findElement(By.xpath("//a[text()='Leads']"));
		
	if(product1.equals(product1)) {
			System.out.println("Successfully");
		}
		else {
			System.out.println("failure");
		}
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		 Select s= new Select(ele);
		 s.selectByVisibleText("Mr.");
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("govardhan3");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Hanuman1");
		 driver.findElement(By.xpath("//input[@name='company']")).sendKeys("TechMahindra2");
		 driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		 driver.findElement(By.xpath("//input[@name='Delete']")).click();
		 Alert alt=driver.switchTo().alert();
		 alt.accept();
		
			
		

	}

}
