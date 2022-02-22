package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action_MouseHovering {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		WebElement username=driver.findElement(By.id("txtUsername"));
		username.click();
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.click();
		password.sendKeys("admin123");
		
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		loginbtn.click();
		Thread.sleep(1000);

		WebElement leavebtn=driver.findElement(By.id("menu_leave_viewLeaveModule"));
		Actions act =new Actions(driver);
		act.moveToElement(leavebtn).perform();
		Thread.sleep(1000);

		driver.quit();
	}
}
