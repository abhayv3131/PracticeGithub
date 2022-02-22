package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	driver.manage().window().maximize();
	
	WebElement alert=driver.findElement(By.name("alert"));
	alert.click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	
	WebElement alert2=driver.findElement(By.name("confirmation"));
	alert2.click();
	Thread.sleep(1000);
	driver.switchTo().alert().dismiss();

	WebElement alert3=driver.findElement(By.name("prompt"));
	alert3.click();
	Thread.sleep(1000);
	driver.switchTo().alert().sendKeys("abhay");
	Thread.sleep(1000);
	driver.switchTo().alert().accept();	
	
}
}
