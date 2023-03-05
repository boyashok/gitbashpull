package Practice;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.Excel_Utility;
import GenericUtility.Java_Utility;
import GenericUtility.WebDriver_Utility;
import Object_repository.CampaignwithProductPage;
import Object_repository.Home_Page;

public class CreateCampaignwithProduct extends BaseClass{
   @Test
   public void createcampaignwithProductTest() throws Throwable
   {
	
	   Home_Page hp= new Home_Page(driver);
	hp.moremodule(driver);
	hp.campainmodule();
	
	//driver.findElement(By.xpath("//a[text()='More']")).click();
	//driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
	CampaignwithProductPage cpp= new CampaignwithProductPage(driver);
	cpp.PlusIcon();
	//driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
	/*FileInputStream fis1= new FileInputStream("./src/test/resources/\\commondata.xlsx");
	Workbook book= WorkbookFactory.create(fis1);
	Sheet sh=book.getSheet("Sheet1");
	Row row=sh.getRow(1);
	Cell cel=row.getCell(0);
	String value1=cel.getStringCellValue()+num;*/
	Java_Utility jlib= new Java_Utility();
	int num=jlib.randNum();
	Excel_Utility elib= new Excel_Utility();
	String value1=elib.getSheetandRow("CampaignName", 0, 0)+num;
	cpp.CampaignName(value1);
	cpp.smallPlus();
	//driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(value1);
	//driver.findElement(By.xpath("//img[@title='Select']")).click();
	WebDriver_Utility wlib= new WebDriver_Utility();
	//wlib.switchToWindow(driver,"parentid");
	Set<String>	title=driver.getWindowHandles();
	Iterator it=	title.iterator();
	   String parentid=(String) it.next();
	   String childid = (String) it.next();
	   driver.switchTo().window(childid);
	 // cpp.ProductName(childid,driver);
	  //cpp.ProductNaMe();
	   driver.findElement(By.xpath("//a[text()='Laptop']")).click();
	 driver.switchTo().window(parentid);
	 cpp.SaveBUttoN();
	 cpp.DeleteButtoN();
	 
	 // driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		// driver.findElement(By.xpath("//input[@name='Delete']")).click();
		 wlib.handleAlertPopup(driver);
		 
		 Thread.sleep(1000);
			//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			//driver.close();
			
	
}
}
