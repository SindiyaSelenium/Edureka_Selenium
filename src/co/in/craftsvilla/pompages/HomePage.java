package co.in.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import co.in.craftsvilla.generic.BasePage;

public class HomePage extends BasePage  //DECLARATION PART OF POM PAGES
{
	@FindBy(xpath = "//span[text()='Sign In']")
	public WebElement signInButton;
	
	@FindBy(id = "cartCount")
	private WebElement cartButton;
	
	@FindBy(name = "q")
	private WebElement searchVal;
	
	@FindBy(xpath = "//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private WebElement sareesLink;
	
	@FindBy(xpath="//a[@href='/jewellery/necklaces/?MID=megamenu_jewellery_seeall']")
	private WebElement jewelleryLink;
	
	public HomePage(WebDriver driver) //A Constructor  //INITIALIZATION PART OF POM PAGES
	
	{
		super(driver);
		PageFactory.initElements(driver, this); // this is used to initialize current page here.
	}
	
	public void clickOnSignInButton() //UTILIZATION PART OF POM PAGES
	//All methods will be void methods as they will not return anything
	
	{
		try
		{
			verifyElementPresent(signInButton);
			signInButton.click();
		}
		catch(Exception e)
		{
			Reporter.log("Element not found" +e);
		}
	}
	
	public void clickOnCartButton()
	{
		try
		{	
			verifyElementPresent(cartButton);
			cartButton.click();
			log.info("Element Found and clicked");
		}
		catch(Exception e)
		{
			Reporter.log("Element not found" +e);
		}	
	}

	public void enterTextInSearchText(String str)
	{
		
		try
		{
			verifyElementPresent(searchVal);
			searchVal.sendKeys(str);
		}
		catch(Exception e)
		{
			Reporter.log("Element not found" +e);
		}
	}
	
	public void goToSareesLink()
	{
		try
		{
			verifyElementPresent(sareesLink);
			mouseHover(driver, sareesLink);
		}
		catch(Exception e)
		{
			Reporter.log("Element not found" +e);
		}
	}
	
	public void goToJewelleryLink()
	{
		try
		{
			verifyElementPresent(jewelleryLink);
			mouseHover(driver, jewelleryLink);
		}
		catch(Exception e)
		{
			Reporter.log("Element not found" +e);
		}
	}
}
