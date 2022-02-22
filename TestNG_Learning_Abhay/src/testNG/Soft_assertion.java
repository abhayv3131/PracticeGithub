package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertion {
	private static final String priority = null;
	WebDriver driver;
	SoftAssert softy;
@BeforeSuite
public void browserlaunch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
}
@Test(priority=1)
public void loginPage() {
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.click();
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.id("txtPassword"));
	password.click();
	password.sendKeys("admin123");
	WebElement loginbtn=driver.findElement(By.id("btnLogin"));
	loginbtn.click();
}
@Test(priority=2)
public void homepageverifying() {
	this.softy=new SoftAssert();
	String dashboard=driver.findElement(By.xpath("//div[@id='mainMenu']//a[@id='menu_dashboard_index']//*")).getText();
	softy.assertEquals(dashboard, "Dashboard");
//	softy.assertAll();
}
}
