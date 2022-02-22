package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Handling {
public static void main(String[] args) throws InterruptedException   {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
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
	
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=1;i<checkboxes.size();i++) {
		checkboxes.get(i).click();
		Thread.sleep(1000);
	}
		
}
}
