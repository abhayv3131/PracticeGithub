package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/popups");
		WebElement alert=driver.findElement(By.xpath("//input[@name='alert']"));
		alert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

	}
}
