package seld.seld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = DriverConnection.createConnection(url);
		WebElement dropdown = driver.findElement(By.className("dropdown-toggle"));
	    dropdown.click();
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.ARROW_DOWN).pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).build().perform();
				}

}
