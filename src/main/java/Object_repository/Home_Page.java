package Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriver_Utility;

public class Home_Page {

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	private WebElement leadsmodule;
	
	@FindBy(linkText="Organizations")
	private WebElement orgmodule;
   
	@FindBy(linkText="Contacts")
   private WebElement contactmodule;
	
	@FindBy(linkText="Products")
	private WebElement productmodule;
	
	@FindBy(linkText="More")
	private WebElement moremodule;
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignmodule;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutimg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;

	
	public WebElement getLeadsmodule() {
		return leadsmodule;
	}
	public WebElement getOrgmodule() {
		return orgmodule;
	}
	public WebElement getContactmodule() {
		return contactmodule;
	}
	public WebElement getProductmodule() {
		return productmodule;
	}
	public WebElement getMoremodule() {
		return moremodule;
	}
	public WebElement getCampaignmodule() {
		return campaignmodule;
	}
	public WebElement getSignoutimg() {
		return signoutimg;
	}
	public WebElement getSignout() {
		return signout;
	}
	//business logics
	public void clickLeadslink() {
		leadsmodule.click();
	}
	public void clickProductLink() {
		productmodule.click();
	}
	public void clickOrgLink() {
		orgmodule.click();
	}
	public void clickContLink() {
		contactmodule.click();
	}
	public void moremodule(WebDriver driver) {
		WebDriver_Utility wlib= new WebDriver_Utility();
		wlib.mouseHoverActio(driver, moremodule);
	}
	public void campainmodule() {
		campaignmodule.click();
	}
	public void signoutimg(WebDriver driver) {
		Actions act= new Actions(driver);
		act.moveToElement(signoutimg).perform();
		signout.click();
	
	}

}

