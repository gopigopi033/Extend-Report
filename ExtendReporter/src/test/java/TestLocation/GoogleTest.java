package TestLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mainfunctions.TestBase;

public class GoogleTest extends TestBase {

	@BeforeMethod 
	public void before() {
		beforeMethod();
	}

	@Test(priority = 1)
	public void SearchName() {
		driver.findElement(By.name("q")).sendKeys("gopi", Keys.ENTER);
	}

	@Test(priority = 2)
	public void GoogleTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Goog");
	}

	@Test(priority = 3)
	public void TextisDiplayorNot() {
		boolean b = driver.findElement(By.xpath("//div[@id='SIvCob']")).isDisplayed();
		Assert.assertFalse(b);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
