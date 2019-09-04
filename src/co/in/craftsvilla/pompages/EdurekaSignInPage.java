package co.in.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.in.craftsvilla.generic.BasePage;

public class EdurekaSignInPage extends BasePage
{
	@FindBy (id="si_popup_email")
	private WebElement emailID;
	
	@FindBy(id = "si_popup_passwd")
	private WebElement passwrd;
	
	@FindBy(xpath="//button[@class='clik_btn_log btn-block']")
	private WebElement loginbtn;
	
	public EdurekaSignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void enterLoginEmail(String emailAdd)
	{
		try
		{
			verifyElementPresent(emailID);
			emailID.clear();
			emailID.sendKeys(emailAdd);
			log.info(emailID+ " found and entered successfully");
		}
		catch(Exception e)
		{
			log.error(emailID+ " element not  found");
		}
	}
	
	public void enterPassword(String password)
	{
		try
		{
			verifyElementPresent(passwrd);
			passwrd.sendKeys(password);
			log.info("Password element found and entered successfully");
		}
		catch(Exception e)
		{
			log.error("Element not found");
		}
	}
	public void clickOnLoginButton()
	{
		try
		{
			verifyElementPresent(loginbtn);
			loginbtn.click();
			log.info("Element found and clicked");
		}
		catch(Exception e)
		{
			log.error("Element not found");
		}
	}
}
	
