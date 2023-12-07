package basic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fbj {
	
	static WebDriver driver = null;
	@BeforeClass
	public static void openBrowser() {
		driver  = DriverConnection.createConnection("https://www.facebook.com/");
	}
	
	@Test	
	public void check() {
		assertEquals("facebook log in page", driver.getTitle());
	}
	@Test
	public void checkLogin() {
		driver.findElement(By.id("email")).sendKeys("kkk@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ssss@123");
		driver.findElement(By.name("login")).click();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
		driver.close();
	}

	   }


