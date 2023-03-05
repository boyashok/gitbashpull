package Practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.Excel_Utility;
import GenericUtility.File_Utility;
import GenericUtility.Java_Utility;
import Object_repository.Home_Page;
import Object_repository.Login_Page;
import Object_repository.ProductCreationPage;
@Listeners(GenericUtility.ListnerImplementation.class)
public class CreateProduct extends BaseClass {

	@Test(groups= {"smoke","regression"})
	public void createproduct() throws Throwable {
	
	Home_Page hp= new Home_Page(driver);
	hp.clickProductLink();
	ProductCreationPage pcg= new ProductCreationPage(driver);
	pcg.PlusProduct();
		//	driver.findElement(By.xpath("//a[text()='Products']")).click();
		WebElement product=driver.findElement(By.xpath("//a[text()='Products']"));
		if(product.equals(product)) {
			System.out.println("Successfully");
		}
		else {
			System.out.println("failure");
		}

		//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		Java_Utility jlib= new Java_Utility();
		int num=jlib.randNum();
		/*FileInputStream fis1= new FileInputStream("./src/test/resources/\\commondata.xlsx");
		Workbook book= WorkbookFactory.create(fis1);
		Sheet sh=book.getSheet("Sheet1");
		Row row=sh.getRow(1);
		Cell cel=row.getCell(0);
		String value1=cel.getStringCellValue()+num;*/
		Excel_Utility elib= new Excel_Utility();
		String value1=elib.getSheetandRow("Sheet1", 1, 0)+num;
		pcg.ProductName(value1);
		pcg.SaveButton();
		//driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(value1);
		//driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		//Thread.sleep(1000);
		//hp.signoutimg(driver);
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		

	}
	//@Test
	//public void method() {
		//System.out.println("method1 successful");
	//}

}
