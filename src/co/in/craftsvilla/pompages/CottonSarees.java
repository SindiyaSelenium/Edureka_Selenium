package co.in.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.in.craftsvilla.generic.BasePage;

public class CottonSarees extends BasePage
{
	@FindBy (xpath = "//img[contains(@src,'1521112236-Craftsvilla_1.jpg')]")
	private WebElement product1521112236;
	
	@FindBy(xpath="//img[contains(@src,'1529159810-Craftsvilla_1.jpg')]")
	private WebElement product1529159810;
	
	@FindBy(xpath = "//img[contains(@src,1529159912-Craftsvilla_1.jpg')]")
	private WebElement product1529159912;
	
	public CottonSarees(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnproduct1521112236()
	{
		try 
		{
			verifyElementPresent(product1521112236);
			product1521112236.click();
			log.info("Product" +product1521112236+ " successfully clicked");
		}
		catch(Exception e)
		{
			log.error("Product" +product1521112236+ "not found" +e);
		}

	}
	
	public void clickOnproduct1529159810()
	{
		try
		{
			verifyElementPresent(product1529159810);
			product1529159810.click();
			log.info("Product" +product1529159810+ " successfully clicked");
		}
		catch(Exception e)
		{
			log.error("Product" +product1529159810+ " not found");
		}
	}
	
	public void clickOnproduct1529159912()
	{
		try
		{
			verifyElementPresent(product1529159912);
			product1529159912.click();
			log.info("Product" +product1529159912+ " successfully clicked");
		}
		catch(Exception e)
		{
			log.error("Product" +product1529159912+ " not found");
		}
	}

}
