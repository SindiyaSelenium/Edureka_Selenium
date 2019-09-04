package co.in.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.in.craftsvilla.generic.BasePage;

public class SareesPage extends BasePage
{

	@FindBy(xpath = "//a[@href='https://www.craftsvilla.com/cvfeeds/buy-cotton-comfort-online-craftsvilla']")
	private WebElement cottonSarees;
	
	@FindBy(xpath = "//a[contains(@href,'silk-sarees')]")
	private WebElement silkSarees;
	
	@FindBy(xpath="//a[href=https://www.craftsvilla.com/womens-clothing/sarees/?MID=megamenu_sarees_seeall]")
	private WebElement viewAll;

	public SareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCottonSarees()
	{
		try
		{
			verifyElementPresent(cottonSarees);
			cottonSarees.click();
			log.info("Cotton Sarees link clicked successfully");
		}
		catch(Exception e)
		{
			log.error("Element not present");
		}
	}
	
	public void clickOnSilkSarees()
	{
		try
		{
			verifyElementPresent(silkSarees);
			silkSarees.click();
			log.info("Silk Sarees link clicked successfully");
		}
		catch(Exception e)
		{
			log.error("Element not present");
		}
	}

	public void viewAllSarees()
	{
		try
		{
			verifyElementPresent(viewAll);
			viewAll.click();
			log.info("View All sarees link clicked successfully");
		}
		catch(Exception e)
		{
			log.error("Element not found");
		}
	}
}