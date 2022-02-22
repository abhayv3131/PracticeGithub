package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethodsCheck {
	public static WebDriver driver;
		
	@Test(priority=1)
	public void verifyTitle() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "OraHRM", "Title checking");
	}

	@Test(priority=2,dependsOnMethods="verifyTitle")
	public void loginbtncheck() {
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		boolean output=loginbtn.isDisplayed();
		System.out.println(output);
	}
}
