package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
@Test
  
   public void method() {
	WebDriver driver;
	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	String UN = System.getProperty("username");
	//File_Utility fil= new File_Utility();
	//String BROWSER=fil.getKeyandValue("browser");
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
	driver.get(URL);
	driver.findElement(By.id("user-name")).sendKeys(UN);
	   //pushed successful
     //pulled successful
}
  
}
