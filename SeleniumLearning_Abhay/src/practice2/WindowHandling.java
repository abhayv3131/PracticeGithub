package practice2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));

		
		String primaryWindowId=driver.getWindowHandle();
		System.out.println(primaryWindowId);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(1000);
		
		Set <String> allWindowID=driver.getWindowHandles();
		for(String eachID:allWindowID) 
		{
			driver.switchTo().window(eachID);
			

			if(driver.getCurrentUrl().equals("https://www.orangehrm.com/"));
//			if(!eachID.equals(primaryWindowId))
			{ 
				Thread.sleep(1000);
			  driver.findElement(By.xpath("//a[contains(text(),'Contact Sales')]")).click();
			   }
		}
		driver.switchTo().window(primaryWindowId);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbtn.click();
	}
}
