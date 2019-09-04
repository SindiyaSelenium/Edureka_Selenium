package co.in.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.in.craftsvilla.generic.BasePage;

public class EdurekaBlogsPage extends BasePage

{
	@FindBy(xpath = "//*[@id='menu-item-97007']")
	private WebElement selenblog;
	
	@FindBy(xpath="//*[@id='menu-item-97008']")
	private WebElement selenInter;
	
	public EdurekaBlogsPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnseleniumBlogs()
	{
		try
		{
			verifyElementPresent(selenblog);
			selenblog.click();
			log.info("Selenium Blogs link found and clicked successfully");
		}
		catch(Exception e)
		{
			log.error("Selenium blogs not found.");;
		}
	}
	
	public void clickOnSeleniumInterviewQues()
	{
		try
		{
			verifyElementPresent(selenInter);
			selenInter.click();
			log.info("Selenium Interview questions link found and clicked successfully");
		}
		catch(Exception e)
		{
			log.error("Selenium interview questions link not found.");
		}
	}
	
}
