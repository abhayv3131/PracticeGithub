package practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
//	driver.get("https://chercher.tech/practice/implicit-wait-example");
	driver.get("https://chercher.tech/practice/explicit-wait");
//	driver.get("https://chercher.tech/practice/implicit-wait-example");

	driver.manage().window().maximize();
	
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	int i=1;
//	
//	while(i>0) {
//		driver.findElement(By.xpath("//input[@type='checkbox']["+i+"]")).click();
//		i++;
//		
//	}
	driver.findElement(By.xpath("//button[@id='alert']")).click();
	WebDriverWait wait=new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	
}
}
