package seld.seld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alert {
public static void main(String[] args) {
	String url = "https://demo.guru99.com/test/delete_customer.php";
	WebDriver driver = DriverConnection.createConnection(url);
	WebElement cusid = driver.findElement(By.name("cusid")); 
	cusid.sendKeys("kkk");
	WebElement submit = driver.findElement(By.name("submit"));
	submit.click();
	WebElement pop = driver.findElement(By.xpath("/html/body/form"));
	pop.click();
}
}
