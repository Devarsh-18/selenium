package seld.seld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouse {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = DriverConnection.createConnection(url);
		WebElement testing = driver.findElement(By.partialLinkText("Testing"));
		WebElement selenium = driver.findElement(By.partialLinkText("Selenium"));
		WebElement java = driver.findElement(By.partialLinkText("Java"));
		Actions actions = new Actions(driver);
		actions.moveToElement(testing).build().perform();
		actions.moveToElement(selenium).build().perform();
		actions.moveToElement(java).build().perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
