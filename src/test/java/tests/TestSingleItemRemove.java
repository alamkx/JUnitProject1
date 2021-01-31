package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import pages.SingleItemRemove;
import util.LaunchBrowser;

public class TestSingleItemRemove extends LaunchBrowser {

	SingleItemRemove singleremove;

	@Before
	public void setUp() {

		init();
		singleremove = PageFactory.initElements(driver, SingleItemRemove.class);

	}

	@Test
	public void loginTest() throws Throwable {
		singleremove.SingleRemove();

		Thread.sleep(2000);

	}

	@After
	public void tearDown() {

		driver.close();
		driver.quit();

	}

}
