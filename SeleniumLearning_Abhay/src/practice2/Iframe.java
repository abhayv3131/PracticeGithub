package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	driver.manage().window().maximize();
	
	WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(iframe);
	WebElement source=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	Actions act=new Actions(driver);
	act.clickAndHold(source).moveToElement(source, 500, 0).release().build().perform();
	
}
}
