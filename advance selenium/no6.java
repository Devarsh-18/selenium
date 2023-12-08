package appium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class no6 {
	@Test (priority = 1)
	public void chromeTest () {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\report\\chromedriver\\chromedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    System.out.println("chrome open");
	}
	@Test (priority = 3)
	public void edgeTest() {
    System.setProperty("webdriver.edge.driver", "C:\\Users\\report\\edgedriver\\msedgedriver.exe");
    WebDriver driver1 = new EdgeDriver();
    driver1.manage().window().maximize();
    System.out.println("edge open");
	}   
	@Test (priority = 2)
	public void ffTest() {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\report\\geckodriver\\geckodriver.exe");
    WebDriver driver2 = new FirefoxDriver();
    driver2.manage().window().maximize();
    System.out.println("firefox open");
//    driver.get(url);
}


}
