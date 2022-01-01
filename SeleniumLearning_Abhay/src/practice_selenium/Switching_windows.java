package practice_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_windows {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	WebDriver driver1 =new ChromeDriver();
	driver1.get("https://opensource-demo.orangehrmlive.com/");
	driver1.manage().window().maximize();
	Thread.sleep(1000);
	WebElement text=driver1.findElement(By.xpath("//*[contains(text(),'OrangeHRM, Inc')]"));
	text.click();
	
	String primaryscreen = driver1.getWindowHandle();
	System.out.println(primaryscreen);
	
	Set<String> allscreens = driver1.getWindowHandles();
	for(String eachid:allscreens) {
		driver1.switchTo().window(eachid);
		if(driver1.getTitle().contains("OrangeHRM HR Software | Free HR Software | HRMS | HRIS")){
			
			driver1.findElement(By.xpath("//*[contains(text(),'Contact Sales')]")).click();
		}
	}
	driver1.switchTo().window(primaryscreen);
	WebElement username = driver1.findElement(By.id("txtUsername"));
	username.click();
	username.sendKeys("Admin");
	WebElement password = driver1.findElement(By.id("txtPassword"));
	password.click();
	password.sendKeys("admin123");
	WebElement btnlogin = driver1.findElement(By.id("btnLogin"));
	btnlogin.click();

	
	
	
}
}
