package Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCreationPage {
   
	public ProductCreationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement plusProduct;
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productname;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement saveButtoN;

	public WebElement getPlusProduct() {
		return plusProduct;
	}

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getSaveButtoN() {
		return saveButtoN;
	}
	//business logic
	public void PlusProduct() {
		plusProduct.click();
		
	}
	public void ProductName(String value1) {
		productname.sendKeys(value1);
	}
	public void SaveButton() {
		saveButtoN.click();
	}
	
	
	
}
