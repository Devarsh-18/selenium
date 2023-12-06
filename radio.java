package seld.seld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class radio {
	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/radio.html";
		WebDriver driver = DriverConnection.createConnection(url);
		WebElement r1 = driver.findElement(By.id("vfb-7-1"));
		r1.click();
		WebElement box = driver.findElement(By.id("vfb-6-1"));
		box.click();
			
		
		
	}

}
