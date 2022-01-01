package practice_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	driver.manage().window().maximize();
	
	WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(iframe);
	WebElement Slid=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	
	Actions slider=new Actions(driver);
	slider.clickAndHold(Slid).moveToElement(Slid, 500, 0).release().build().perform();
	Thread.sleep(1000);
	
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//li[@class='menu-item']//a")).click();
	
	
}
}
