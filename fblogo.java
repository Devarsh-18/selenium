package seldt.seldt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogo {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=royal_blue_bar&from_login_screen=0");
WebElement logo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[1]/div/div[2]/div[1]"));
System.out.println(logo.getText());

}
}
