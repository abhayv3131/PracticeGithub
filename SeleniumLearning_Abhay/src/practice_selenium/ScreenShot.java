package practice_selenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://groww.in/");
	driver.manage().window().maximize();
	
	WebElement groww=driver.findElement(By.xpath("//span[text()='Login/Register']"));
	groww.click();
	
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File source=screenshot.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM//Abhay.jpg");
	FileHandler.copy(source, destination);
	
	
}
}
