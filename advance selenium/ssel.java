package appium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ExcelFileReader.DriverConnection;




public class ssel {

	

		static WebDriver driver;

		@BeforeClass
		public void openBrowser() {
			driver = new DriverConnection().getConnection("https://www.browserstack.com/users/sign_in");
			

		}

		@Test(dataProvider = "dp")
		public void logintest(String EmailId, String pass) throws InterruptedException {
			String emailid = String.valueOf(EmailId);
			String pas = String.valueOf(pass);
			System.out.println(emailid + " " + pass);
			WebElement emailid1 = driver.findElement(By.xpath("//input[@id='user_email_login']"));
			emailid1.clear();

				@Test(dataProvider = "dp")
				public void logintest(String EmailId, String pass) throws InterruptedException {
					String emailid = String.valueOf(EmailId);
					String pas = String.valueOf(pass);
					System.out.println(emailid + " " + pass);
					WebElement emailid1 = driver.findElement(By.xpath("//input[@id='user_email_login']"));
					emailid1.clear();
					emailid1.sendKeys(EmailId);
					WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
					password.clear();
					password.sendKeys(pas);
					System.out.println("Pass no entered");
					Thread.sleep(2000);
				
					WebElement LoginIn = driver.findElement(By.xpath("(//*[@id=\"signin_signup_form\"]/div[1]/div/div[1]/fieldset/div[9]/a)"));
					LoginIn.click();
					System.out.println("Login clicked");
					Thread.sleep(2000);
					
					WebElement MailId = driver.findElement(By.name("identifier"));
					MailId.sendKeys("abs@dff.com");
					System.out.println("Mail entered");
					
					
					WebElement Next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
					Next.click();
					System.out.println("Next Button clicked");
					

					WebElement Signout = driver.findElement(By.id("account-menu-toggle"));
					Signout.click();
					System.out.println("Signout menu clicked");

					WebElement Signout1 = driver.findElement(By.id("sign_out_link"));
					Signout1.click();
					System.out.println("Signout Button clicked");
				}

				@DataProvider(name = "dp")
				public Object[][] data() {
					Q1ExcelFileReader ex = new Q1ExcelFileReader("C:\\Users\\report\\abc.xlsx", "Keywords");
					int row = ex.rowCount();
					System.out.println("row : " + row);
					int col = ex.colCount();
					System.out.println("col : " + col);

					Object obj[][] = new Object[row - 1][col];

					for (int i = 1; i < row; i++) {
						for (int j = 0; j < col; j++) {
							String data = ex.getData(i, j);
							obj[i - 1][j] = data;
						}
					}
					return obj;
				}



}
