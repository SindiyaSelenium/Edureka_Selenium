package co.in.craftsvilla.testscripts;

import org.testng.annotations.Test;

import co.in.craftsvilla.generic.BaseTest;
import co.in.craftsvilla.generic.ReadExcel;
import co.in.craftsvilla.pompages.EdurekaCoursesPage;
import co.in.craftsvilla.pompages.EdurekaHomePage;
import co.in.craftsvilla.pompages.EdurekaSignInPage;

public class LoginScripts extends BaseTest
{
	EdurekaHomePage homepage = null;
	EdurekaSignInPage signIn = null;
	EdurekaCoursesPage coursePage = null;
	
	@Test
	public void TC_01_loginToEdureka()
	{
		homepage = new EdurekaHomePage(driver);
		signIn = new EdurekaSignInPage(driver);
		
		try
		{
			String[][] credentials = ReadExcel.getData(inputData, "Login");
			for(int i=1; i<credentials.length;i++) // i=1 because i=0 is the header in the file/
			{
				String email = credentials[i][0];
				String pwd = credentials[i][1];	
				
				homepage.clickOnSignInButton();
				signIn.enterLoginEmail(email);
				signIn.enterPassword(pwd);
				signIn.clickOnLoginButton();
				coursePage.verifyTitle("https://learning.edureka.co/mycourses");
			}
			log.info("TC_01_loginToEdureka passed");
		}
		catch(Exception e)
		{
			log.error("TC_01_loginToEdureka failed" +e);
		}
	}
}
