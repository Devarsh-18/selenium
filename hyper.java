package seld.seld;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hyper {
	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/web-table-element.php";
		WebDriver driver = DriverConnection.createConnection(url);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
	}

}
