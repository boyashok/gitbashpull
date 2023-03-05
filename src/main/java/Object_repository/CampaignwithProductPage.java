package Object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignwithProductPage {

	 public CampaignwithProductPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(xpath="//img[@title='Create Campaign...']")
	 private WebElement Pluscampaign;
	 
	 @FindBy(xpath="//input[@name='campaignname']")
	 private WebElement campaignName;
	 
	 @FindBy(xpath="//img[@title='Select']")
	 private WebElement smallPlusproduct;
	 
	 @FindBy(xpath="//a[text()='Laptop']")
	 private WebElement ProductName;
	 
	 @FindBy(xpath="//input[@title='Save [Alt+S]']")
	 private WebElement SaveBUtton;
	 
	 @FindBy(xpath="//input[@name='Delete']")
	 private WebElement DeleteButton;

	public WebElement getPluscampaign() {
		return Pluscampaign;
	}

	public WebElement getCampaignName() {
		return campaignName;
	}

	public WebElement getSmallPlusproduct() {
		return smallPlusproduct;
	}

	public WebElement getProductName() {
		return ProductName;
	}

	public WebElement getSaveBUtton() {
		return SaveBUtton;
	}

	public WebElement getDeleteButton() {
		return DeleteButton;
	}
	 
	 public void  PlusIcon() {
		 Pluscampaign.click();
	 }
	 public void CampaignName(String value1) {
		 campaignName.sendKeys(value1);
	 }
	 public void smallPlus() {
		 smallPlusproduct.click();
	 }
	 public void ProductName(String childid, WebDriver driver) {
		 ProductName.sendKeys(childid);
		 driver.findElement(By.xpath("//a[text()='"+childid+"']")).click();
		}
	 public void ProductNaMe() {
		 ProductName.click();
	 }
	 public void SaveBUttoN() {
		 SaveBUtton.click();
	 }
	 public void DeleteButtoN() {
		 DeleteButton.click();
	 }
	 
}
