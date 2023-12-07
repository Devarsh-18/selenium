package com.mobile.MyFirstTest;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class junit {
	@RunWith(Parameterized.class)
	public static class T008_FBLoginParameterized {
		String email, password;

		public T008_FBLoginParameterized(String email, String password) {
			super();
			this.email = email;
			this.password = password;
		}

		static WebDriver driver;

		@BeforeClass
		public static void openBrowser() {
			driver = DriverConnection.createConnection("https://www.facebook.com/");
		}

		@Test
		public void loginTest() {
			WebElement emailele = driver.findElement(By.id("email"));
			emailele.clear();
			emailele.sendKeys(email);
			WebElement pass = driver.findElement(By.id("pass"));
			pass.clear();
			pass.sendKeys(password);
		}

		@Parameters
		public static List<Object[]> getData() {
			Object o[][] = new Object[4][2];

			o[0][0] = "valid@gmail.com";
			o[0][1] = "invalid";

			o[1][0] = "invalid@gmail.com";
			o[1][1] = "valid";

			o[2][0] = "valid@gmail.com";
			o[2][1] = "valid";

			o[3][0] = "invalid@gmail.com";
			o[3][1] = "invalid";

			return Arrays.asList(o);
		}

	}
}