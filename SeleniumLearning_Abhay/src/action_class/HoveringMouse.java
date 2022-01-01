package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoveringMouse {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	WebDriver hovering=new ChromeDriver();
	hovering.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	hovering.manage().window().maximize();
	
	WebElement username=hovering.findElement(By.xpath("//input[@id='txtUsername']"));
	username.sendKeys("Admin");
	
	WebElement password=hovering.findElement(By.id("txtPassword"));
	password.sendKeys("admin123");
	
	WebElement btnlogin=hovering.findElement(By.id("btnLogin"));
	btnlogin.click();
	
	WebElement pointer=hovering.findElement(By.xpath("//*[@id='menu__Performance']"));
	
	Actions act=new Actions(hovering);
	act.moveToElement(pointer).perform();

}
}
