package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.File_Utility;
import GenericUtility.WebDriver_Utility;
import Object_repository.Login_Page;

public class CreateContactwithOrganisation extends BaseClass {
   @Test(groups="smoke")
   public void CreateContactwithOrganisationTest() throws IOException, InterruptedException
	 {
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		 Select s= new Select(ele);
		 s.selectByVisibleText("Mr.");
		 Random r= new Random();
		 int rand=r.nextInt(100);
		 FileInputStream fis1= new FileInputStream("./src/test/resources/\\commondata.xlsx");
			Workbook book= WorkbookFactory.create(fis1);
			Sheet sh=book.getSheet("ContactName");
			Row row=sh.getRow(0);
			Cell cel=row.getCell(0);
			String value1=cel.getStringCellValue()+rand;
			
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(value1);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("monali");
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
  Set<String>allid=driver.getWindowHandles();
    Iterator it=allid.iterator();
    String parentId = (String) it.next();
    String childId= (String) it.next();
     driver.switchTo().window(childId);
		driver.findElement(By.xpath("//a[text()='Qspider-837231175']")).click();
		 driver.switchTo().window(parentId);
		   driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			 driver.findElement(By.xpath("//input[@name='Delete']")).click();
			WebDriver_Utility wlib= new WebDriver_Utility();
			 wlib.handleAlertPopup(driver);
			// Alert alt=driver.switchTo().alert();
			// alt.accept();
			 //Thread.sleep(1000);
				//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
				//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			

	}

}
