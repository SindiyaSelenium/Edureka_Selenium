package co.in.craftsvilla.generic;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage 
{
	public WebDriver driver = null;
	public Logger log = Logger.getLogger(BasePage.class);
	
	public BasePage(WebDriver driver) //This is a constructor. Constructor name is same as the Class Name.
	{
		this.driver = driver; //'this' is used to refer to current class instance, global variable.
	}
	
	public void verifyTitle(String expect_Title)
	{
		WebDriverWait wait = new WebDriverWait(driver,60);
		String actual_Title = null;
		try
		{
			wait.until(ExpectedConditions.titleIs(expect_Title));
			actual_Title = driver.getTitle();
		
			/*	To compare actual and expected title - we will not use if and else statements. 
			We will now use Assert class - This is from TestNG*/
			
			Assert.assertEquals(actual_Title, expect_Title);
			log.info(actual_Title+" and "+expect_Title+" are the same.");	
		}
		
		catch(Exception e)
		{
			log.error(actual_Title+" and "+expect_Title+ " are not the same.");
		}
	}
	
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		try
		{
			wait.until(ExpectedConditions.visibilityOf(ele));
			log.info(ele+" Elemenet present");
		}
		catch(Exception e)
		{
			log.error(ele+ " Element not found");
		}
	}	
	
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		//WebDriverWait wait = new WebDriverWait(driver,30);
		
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			log.info("Mouse hovered on " +ele);
		}
		catch(Exception e)
		{
			log.error(ele+ " Element not found");
		}
	}
}
