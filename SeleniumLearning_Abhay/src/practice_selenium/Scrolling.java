package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);


	
	WebElement username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
	username.sendKeys("Admin");
	WebElement password =driver.findElement(By.xpath("//input[@id='txtPassword']"));
	password.sendKeys("admin123");
	WebElement login =driver.findElement(By.xpath("//input[@id='btnLogin']"));
	login.click();
	
	WebElement admin =driver.findElement(By.id("menu_admin_viewAdminModule"));
	admin.click();
	Thread.sleep(1000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,2127)");//SCROLLING DOWN



}
}
