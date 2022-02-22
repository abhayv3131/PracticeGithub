package practice2;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBy {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.click();
	username.sendKeys("Admin");
	
	WebElement password=driver.findElement(By.id("txtPassword"));
	password.click();
	password.sendKeys("admin123");
	
	WebElement loginbtn=driver.findElement(By.id("btnLogin"));
	loginbtn.click();
	
	WebElement adminbtn=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
	adminbtn.click();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,2000)");
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,-1000)");

}
}
