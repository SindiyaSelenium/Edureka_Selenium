package co.in.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.in.craftsvilla.generic.BasePage;

public class SignInPage extends BasePage
{
	@FindBy(id = "emailId")
	private WebElement emailText;
	
	@FindBy(id = "continueBtn")
	private WebElement cntButton;
	
	@FindBy (xpath = "//input[@type = 'password']")
	private WebElement enterpassword;
	
	@FindBy(id = "loginCheck")
	private WebElement loginButton;
	
	@FindBy (id = "emailId")
	private WebElement enterMobileNumber;
	
	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);		
	}
	
	public void enterEmailID(String email)
	{
		try
		{
			verifyElementPresent(emailText);
			emailText.sendKeys(email);
			log.info("Successfully entered the emailID");
		}
		catch(Exception e)
		{
			log.error("Email Text box not found.");
		}
	}
	
	public void clickOnContinueButton()
	{
		try
		{
			verifyElementPresent(cntButton);
			cntButton.click();
			log.info("Continue button clicked");
		}
		catch(Exception e)
		{
			log.error("Continue button not found.");
		}
	}
	
	public void enterPassword(String pwd)
	{
		try
		{
			verifyElementPresent(enterpassword);
			enterpassword.sendKeys(pwd);
			log.info("Successfully entered the password");
		}
		catch(Exception e)
		{
			log.error("Password Text box not found.");
		}
	}
	
	public void clickOnLoginButton()
	{
		try
		{
			verifyElementPresent(loginButton);
			loginButton.click();
			log.info("Successfully clicked on Login Buttin");
		}
		catch(Exception e)
		{
			log.error("Login Button not Found");
		}
	}
}
