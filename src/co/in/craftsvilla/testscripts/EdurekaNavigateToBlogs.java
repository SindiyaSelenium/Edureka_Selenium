package co.in.craftsvilla.testscripts;

import org.testng.annotations.Test;

import co.in.craftsvilla.generic.BaseTest;
import co.in.craftsvilla.pompages.EdurekaBlogsPage;
import co.in.craftsvilla.pompages.EdurekaCoursesPage;


public class EdurekaNavigateToBlogs extends BaseTest
{
	EdurekaCoursesPage coursepage = null;
	EdurekaBlogsPage blogspage = null;
	
	@Test
	public void TC_02_NavigateToBlogsPage()
	{
		coursepage = new EdurekaCoursesPage(driver);
		blogspage = new EdurekaBlogsPage(driver);
		
		try
		{
			coursepage.clickOnCommunityButton();
			coursepage.clickOnBlogsOption();
			blogspage.clickOnseleniumBlogs();
			blogspage.clickOnSeleniumInterviewQues();
			log.info("TC_02_NavigateToBlogsPage passed");
		}
		
		catch(Exception e)
		{
			log.error("TC_02_NavigateToBlogsPage failed");
		}
	}
	
}
