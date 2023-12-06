package seld.seld;

import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gmail {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement name = driver.findElement(By.name("firstName"));
		name.sendKeys("auto");
		WebElement surname = driver.findElement(By.name("lastName"));
		surname.sendKeys("mation");
		WebElement btn = driver.findElement(By.className("VfPpkd-vQzf8d"));
		btn.click();
		Thread.sleep(3000);
		WebElement dy  = driver.findElement(By.id("day"));
		dy.sendKeys("31");

		//WebElement month1 = driver.findElement(By.id("month"));
		Select  month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("1");
		WebElement yr = driver.findElement(By.id("year"));
		yr.sendKeys("1999");
		Select  year = new Select(driver.findElement(By.id("gender")));
		year.selectByValue("1");
		WebElement nxt  =  driver.findElement(By.className("VfPpkd-vQzf8d"));
		nxt.click();
		 WebElement mail = driver.findElement(By.name("Username"));
		 mail.sendKeys("automatiooon2");
		
		
		
		
	}
}