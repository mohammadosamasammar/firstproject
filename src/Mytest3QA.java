import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytest3QA {
	WebDriver driver = new ChromeDriver();
	String myURL = "https://www.saucedemo.com/";
	String myURL2 = "https://www.google.com";
	String username = "mohammadosamasammar";

	@BeforeTest

	public void Mytestswag() throws InterruptedException

	{
		driver.get(myURL2);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get(myURL);
		Thread.sleep(1000);
//		driver.switchTo().alert().accept();

	}

	@Test
	public void CheckTheWebSiteTitle() throws InterruptedException {
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));

		username.sendKeys("standard_user");
		Thread.sleep(1000);
		pass.sendKeys("secret_sauce");
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
		List<WebElement> AddButtons = driver.findElements(By.className("btn_primary"));
		for (int i = 0; i < AddButtons.size(); i++) {
			AddButtons.get(i).click();
		}

		Thread.sleep(2000);

		List<WebElement> RemoveButtons = driver.findElements(By.className("btn_secondary"));
		for (int i = 0; i < RemoveButtons.size(); i++) {
			RemoveButtons.get(i).click();
		}

		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(1000);
		driver.get(myURL2);

	}

	@AfterTest
	public void AfterTesting() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

}
