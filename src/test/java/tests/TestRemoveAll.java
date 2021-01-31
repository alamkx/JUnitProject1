package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveAll;
import util.LaunchBrowser;

public class TestRemoveAll extends LaunchBrowser{
	
	RemoveAll removeall;
	@Before
	public void setUp() {
		
		init();
		removeall = PageFactory.initElements(driver, RemoveAll.class);
		
		
	}
	@Test
public void loginTest() throws Throwable   {
		removeall.ClickRemove();
	
	Thread.sleep(2000);
	
}
	@After
public void tearDown() {
	
	driver.close();
	driver.quit();
	
	}
	
	

}
