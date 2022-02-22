package practice2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettingWindowID {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	
	driver.getWindowHandle();
	String primaryscreenID=driver.getWindowHandle();

	System.out.println(primaryscreenID);
	
	driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
	
	Set<String> windowID=driver.getWindowHandles();
	for(String eachID:windowID) {
		System.out.println(eachID);
	}
	driver.quit();
	}
}
