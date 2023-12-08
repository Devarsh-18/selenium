package appium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class no5 {
	@Test
	public void chromeTest () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\report\\chromedriver\\chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    System.out.println("chrome open");
		}
	@Test
		public void edgeTest() {
	    System.setProperty("webdriver.edge.driver", "C:\\Users\\report\\edgedriver\\msedgedriver.exe");
	    WebDriver driver1 = new EdgeDriver();
	    driver1.manage().window().maximize();
	    System.out.println("edge open");
	    @Test
		public void ffTest() {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\report\\geckodriver\\geckodriver.exe");
	    WebDriver driver2 = new FirefoxDriver();
	    driver2.manage().window().maximize();
	    System.out.println("firefox open");
}

		}   

}
