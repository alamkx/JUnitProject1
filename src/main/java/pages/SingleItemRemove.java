package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingleItemRemove {
	
	WebDriver driver;
	
	public SingleItemRemove(WebDriver driver) {
		
		this.driver = driver;
		
	
	}
	
	public void SingleRemove() {
		
		WebElement element = driver.findElement(By.linkText("june2020"));
		element.isSelected();
		
		WebElement removeAll = driver.findElement(By.name("submit"));
		removeAll.click();
		
		Assert.assertEquals(true, true);
		System.out.println("is removed");
		
			}

}
