package co.in.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.in.craftsvilla.generic.BasePage;

public class EdurekaHomePage extends BasePage

{
	@FindBy(xpath = "//a[@class='signin top-signin giTrackElementHeader hidden-xs']")
	private WebElement loginButton;
	
	public EdurekaHomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInButton()
	{
		try
		{
			verifyElementPresent(loginButton);
			loginButton.click();
			log.info("Sign In Button clicked Successfully");
		}
		catch(Exception e)
		{
			log.error("SignIn Button not present.");
		}
	}
}
