package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginUsingAutomation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
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
	

}
}
