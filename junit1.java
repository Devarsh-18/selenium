package com.mobile.MyFirstTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class junit1 {

	public class GmailLoginTestNG {

	    WebDriver driver;

	    @BeforeTest
	    public void setup() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	       
	 
	      
	        driver.get("https://mail.google.com/");
	    }

	    @Test
	    public void gmailLoginTest() {
	       
	        WebElement email = driver.findElement(By.id("email"));
	      
	        email.sendKeys("hdh@gmail.com");

	        WebElement nextButton = driver.findElement(By.className("VfPpkd-vQzf8d"));
	        nextButton.click();
            WebElement password = driver.findElement(By.name("password"));
	        password.sendKeys("pass");
	        
	        WebElement NextButton = driver.findElement(By.className("VfPpkd-vQzf8d"));
	        NextButton.click();
	    }

	    @AfterTest
	    public void close() {
	        
	        driver.quit();
	    }
	}


}
