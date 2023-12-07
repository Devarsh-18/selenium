package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fbwebdriver {
	  private WebElement driver;

	    @BeforeClass
	    public void sfb() {
	        System.setProperty("webdriver.chrome.driver", "\"D:\\\\chromedriver\\chromedriver.exe\\");

	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testFacebookLogin() {
	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys("your_email@example.com");
	        WebElement passwordField = driver.findElement(By.id("pass"));
	        passwordField.sendKeys("your_password");

	        
	        WebElement loginButton = driver.findElement(By.name("login"));
	        loginButton.click();
              try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
         WebElement profileLink = driver.findElement(By.cssSelector("a[data-testid='profile_link_in_nav']"));
	        assert profileLink.isDisplayed() : "Login failed!";
	    }
	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }

}
