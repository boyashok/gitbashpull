package GenericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Object_repository.Home_Page;
import Object_repository.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	public  WebDriver driver;
	public static WebDriver listenerDriver;
	@BeforeSuite
	public void BS() {
		System.out.println("Database connection");
	}
	@BeforeTest
	public void BT() {
		System.out.println("parallel excution");
	}
	//@Parameters("BROWSER")
	@BeforeClass
	public void BC() throws IOException {
		
		
		File_Utility fil= new File_Utility();
		String BROWSER=fil.getKeyandValue("browser");
		//String BROWSER=System.getProperty("browser");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			driver= new ChromeDriver();
		}
		listenerDriver= driver;
		
		System.out.println("launch the browser");
	}
	@BeforeMethod
	public void BM() throws IOException {
		File_Utility fil= new File_Utility();
		String URL	=fil.getKeyandValue("url");
		String USERNAME=fil.getKeyandValue("username");
		String PASSWORD=fil.getKeyandValue("password");
		driver.get(URL);
		Login_Page log= new Login_Page(driver);
		log.LoginToApp(USERNAME, PASSWORD);
		
		System.out.println("login the application");
	}
	
	@AfterMethod
	public void AM() {
		
		Home_Page hm= new Home_Page(driver);
		hm.signoutimg(driver);
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		System.out.println("logout the application");
	}
	@AfterClass
	public void AC() {
		driver.close();
		System.out.println("close the browser");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("excution compleated");
	}
	@AfterSuite
	public void AS() {
		System.out.println("close the database connection");
	}
	
	
}
