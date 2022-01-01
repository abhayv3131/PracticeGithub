package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_select_class {
public  static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	WebDriver facebook = new ChromeDriver();
	facebook.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
	facebook.manage().window().maximize();
	
	WebElement day=facebook.findElement(By.xpath("//*[@id='day']"));
	WebElement month=facebook.findElement(By.xpath("//*[@id='month']"));
	WebElement year=facebook.findElement(By.xpath("//*[@id='year']"));
	
	Select selDay=new Select(day);
	selDay.selectByIndex(6);
	
	Thread.sleep(1000);

	Select selMonth=new Select(month);
	selMonth.selectByValue("7");
	Thread.sleep(1000);

	Select selYear=new Select(year);
	selYear.selectByVisibleText("1996");
}
}
