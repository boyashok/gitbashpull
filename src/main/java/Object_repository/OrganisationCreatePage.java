package Object_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationCreatePage {
	
   public OrganisationCreatePage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//img[@title='Create Organization...']")
   private WebElement plusicon;
   
   @FindBy(xpath="//input[@name='accountname']")
   private WebElement accountname;
   
   @FindBy(xpath="//input[@class='crmbutton small save']")
   private WebElement savebutton;
   
public WebElement getPlusicon() {
	return plusicon;
}

public WebElement getAccountname() {
	return accountname;
}

public WebElement getSavebutton() {
	return savebutton;
}
   //business logic
  public void plusIcon() {
	  plusicon.click();
  }
   public void username(String value1) {
	  accountname.sendKeys(value1);
  }
  public void SaveButton() {
	  savebutton.click();
  }


}
