package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemoveAll {
	
WebDriver driver;
	
	public RemoveAll(WebDriver driver) {
		
		this.driver = driver;
		
		}

	public void ClickRemove() {
		
		WebElement remove = driver.findElement(By.xpath("//input[@name='allbox']"));
		remove.click();
		
		WebElement removeAll = driver.findElement(By.name("submit"));
		removeAll.click();;
		
				
	}
	
}
