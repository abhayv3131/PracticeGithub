package practice_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_browser {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement btnlogin=driver.findElement(By.id("btnLogin"));
		btnlogin.click();
		
		WebElement Admin=driver.findElement(By.linkText("Admin"));
		Admin.click();
		
		WebElement usermanage=driver.findElement(By.id("menu_admin_UserManagement"));
		usermanage.click();
		
		List<WebElement> users =driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_')]"));
		for(int i=0;i<users.size();i=i+2) {
			users.get(i).click();
		}
		
	}	

}
