package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import pages.CheckBox;
import util.LaunchBrowser;

public class TestCheckBox extends LaunchBrowser{
	
	CheckBox checkboxobj;
	@Before
	public void setUp() {
		
		init();
		checkboxobj = PageFactory.initElements(driver, CheckBox.class);
		
		
	}
	@Test
public void loginTest() throws Throwable   {
	checkboxobj.CheckButton();
	
	Thread.sleep(2000);
	
}
	@After
public void tearDown() {
	
	driver.close();
	driver.quit();
}

}
