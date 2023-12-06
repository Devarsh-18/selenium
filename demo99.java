package seld.seld;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demo99 {
	public static void main(String[] args) {
		
	String url = "https://demo.guru99.com/test/newtours/register.php";
	WebDriver driver = DriverConnection.createConnection(url);
	WebElement name = driver.findElement(By.name("firstName"));
	name.sendKeys("flac");
	WebElement Lastname = driver.findElement(By.name("lastName"));
	Lastname.sendKeys("wav");
	WebElement phone = driver.findElement(By.name("phone"));
	phone.sendKeys("12345679");
	WebElement id = driver.findElement(By.id("userName"));
	id.sendKeys("dddqqqaaa@poo.com");
	WebElement address = driver.findElement(By.name("address1"));
	address.sendKeys("hduhduiqh");
	WebElement city = driver.findElement(By.name("city"));
	city.sendKeys("hduhduiqh");
	WebElement state = driver.findElement(By.name("state"));
	state.sendKeys("hduhduiqh");
	WebElement postalCode = driver.findElement(By.name("postalCode"));
	postalCode.sendKeys("8085");
	Select  country = new Select(driver.findElement(By.name("country")));
	country.selectByVisibleText("UNITED STATES");
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("ddd@ddd.ddd");
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("password");
	WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));
	confirmpassword.sendKeys("password");
	WebElement submit = driver.findElement(By.name("submit"));
	submit.click();
	}}
