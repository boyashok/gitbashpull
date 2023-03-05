package GenericUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

/**
 * This class contains all the web driver methods
 * @author DELL
 *
 */
public class WebDriver_Utility {
   
	public void maximizeWindow(WebDriver driver) {
		
		driver.manage().window().maximize();
	}
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	public void WaitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void scriptTimeOut(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
	}
	public void waitforElementWithCustomTimeOut(WebDriver driver,WebElement element,int time) {
		FluentWait wait= new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void switchToWindow(WebDriver driver,String partialwindowtitle) {
		Set<String> allid=driver.getWindowHandles();
		  Iterator it=allid.iterator();
		  String parentid=(String) it.next();
		   String childid = (String) it.next();
		   driver.switchTo().window(childid);
		   driver.findElement(By.xpath("//a[text()='Laptop']")).click();
		   driver.close();
		   driver.switchTo().window(parentid);
		  
		  
		 /* while(it.hasNext()) {
			  String win = (String) it.next();
			  driver.switchTo().window(win);
			  if(driver.getTitle().contains(partialwindowtitle)) {
				  break;
			  }*/
			 
		  
	}
	public void handleDropdown(WebElement element, int index) {
		Select s= new Select(element);
		s.selectByIndex(index);
	}
	public void handleDropdown(WebElement element,String value) {
		Select s= new Select(element);
		s.selectByValue(value);
	}
	public void handleDropdown(String text,WebElement element) {
		Select s= new Select(element);
		s.selectByVisibleText(text);
	}
	public void mouseHoverActio(WebDriver driver, WebElement element) {
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void rightClickAction(WebDriver driver) {
		Actions act= new Actions(driver);
		act.contextClick().perform();
	}
	public void rightClickAction(WebDriver driver,WebElement element) {
		Actions act= new Actions(driver);
		act.contextClick(element).perform();
	}
	public void handleAlertPopup(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	
   	
}

