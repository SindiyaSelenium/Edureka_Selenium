package co.in.craftsvilla.generic;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITest implements ITestListener
{

	public void onTestStart(ITestResult result)
	{
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		
		
	}

	public void onTestFailure(ITestResult result) 
	{
		String name = result.getMethod().getMethodName();
		EventFiringWebDriver event = new EventFiringWebDriver(BaseTest.driver);
		
		try
		{
			File src = event.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("./Screenshots/"+name+".png")); //used FileHandler instead of FileUtils.
			
		}
		catch(Exception e)
		{
			
		}
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}


	public void onStart(ITestContext context) 
	{
		
	}

	public void onFinish(ITestContext context) 
	{
	
		
	}
}
