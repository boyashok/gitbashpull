package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Launchtheapplication {
  public static void main(String[]args) throws IOException {
	String key= "webdriver.edge.driver";
	String value="C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe";
	System.setProperty(key, value);
	EdgeDriver driver = new EdgeDriver();
	FileInputStream fis = new FileInputStream("./src/test/resources/data.properties.txt");
	Properties p = new Properties();
	p.load(fis);
	String URL = p.getProperty("url");
	String USERNAME=p.getProperty("username");
	String PASSWORD=p.getProperty("password");
	
	driver.get(URL);
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	
	
}
}
