package seld.seld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fb {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
		WebDriver driver = DriverConnection.createConnection(url);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[1]/div/div[2]/div[1]"));
		
		
	}

}
