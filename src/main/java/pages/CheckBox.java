package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LaunchBrowser;

public class CheckBox extends LaunchBrowser{
	
	WebDriver driver;
	
	public CheckBox(WebDriver driver) {
		
		this.driver = driver;
		
	
	}
	
	public void CheckButton() {
		
		WebElement clickCheckButton = driver.findElement(By.name("allbox"));
		clickCheckButton.click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		System.out.println("true");
	}

}
