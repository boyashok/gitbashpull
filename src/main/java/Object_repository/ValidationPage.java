package Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage {
public ValidationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
   @FindBy(xpath="//span[@class='dvHeaderText']")
   private WebElement validation;
   
public WebElement getValidation() {
	return validation;
}
  public void ValiDation(WebDriver driver, String value1) {
	  String avalue=validation.getText();
	  if(avalue.contains(value1)) {
		  System.out.println("Validation pass");
	  }
	  else {
		  System.out.println("validation fail");
	  }
  }


}
