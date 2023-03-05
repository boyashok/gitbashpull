package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericUtility.BaseClass;
import GenericUtility.Excel_Utility;
import GenericUtility.Java_Utility;
import Object_repository.Home_Page;
import Object_repository.OrganisationCreatePage;

public class CreateOrganisation extends BaseClass {
	@Test
	public void createorganisation() throws Throwable {
		Java_Utility jlib= new Java_Utility();
		int num=jlib.randNum();
		//Random r = new Random();
		//int rand=r.nextInt(100);
	Home_Page hm=new Home_Page(driver);
	hm.clickOrgLink();
	
	//driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	WebElement head=driver.findElement(By.xpath("//a[text()='Organizations']"));
	if(head.equals(head)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	OrganisationCreatePage ocp= new OrganisationCreatePage(driver);
	ocp.plusIcon();
	//driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	Excel_Utility elib= new Excel_Utility();
	String value1=elib.getSheetandRow("Sheet1", 1, 0)+num;
    ocp.username(value1);
    ocp.SaveButton();
   //String actual= driver.findElement(By.xpath("//span[text()='"+value1+"']")).getText();
   //SoftAssert st= new SoftAssert();
   //st.assertEquals(actual, value1);
    //ValidationPage vl= new ValidationPage(driver);
    //vl.ValiDation(driver, value1);
    //driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(value1);
	//driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	
		//Thread.sleep(1000);
	 //hm.signoutimg(driver);
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
	}
}