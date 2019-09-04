package co.in.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.in.craftsvilla.generic.BasePage;

public class EdurekaCoursesPage extends BasePage
{
	@FindBy(xpath = "//button[contains(text(),'Community')]")
	private WebElement commBtn;
	
	@FindBy(xpath="//a[contains(@href,'blog')]")
	private WebElement blogBtn;
	
	
	public EdurekaCoursesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCommunityButton()
	{
		try
		{
			verifyElementPresent(commBtn);
			commBtn.click();
			log.info("Element found and clicked successfully");
		}
		catch(Exception e)
		{
			log.error("Element not found");
		}
	}
	
	public void clickOnBlogsOption()
	{
		try
		{
			verifyElementPresent(blogBtn);
			blogBtn.click();
			log.info("Element Present and clicked successfully");
		}
		catch(Exception e)
		{
			log.error("Element not found.");
		}
	}

}
