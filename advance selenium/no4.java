package appium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.WebDriver;

public class no4 {
	public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarika Namsha\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      System.out.println("chrome open");
	  
	      
	      System.setProperty("webdriver.edge.driver", "C:\\Users\\report\\edgedriver_win64\\msedgedriver.exe");
	      WebDriver driver1 = new EdgeDriver();
	      driver.manage().window().maximize();
	      System.out.println("edge open");
	      System.setProperty("webdriver.gecko.driver", "C:\\Users\\report\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	      WebDriver driver2 = new FirefoxDriver();
	      driver.manage().window().maximize();
	      System.out.println("firefox open");
	  
}


}
