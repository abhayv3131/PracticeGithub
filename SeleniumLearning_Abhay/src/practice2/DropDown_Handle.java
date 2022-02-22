package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Handle {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
	driver.manage().window().maximize();
	
	WebElement firstname=driver.findElement(By.name("firstname"));
	firstname.sendKeys("Abhay");
	
	WebElement lastname=driver.findElement(By.name("lastname"));
	lastname.sendKeys("Vishe");
	
	WebElement phone=driver.findElement(By.name("reg_email__"));
	phone.sendKeys("9665697731");
	
	WebElement checkbox=driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
	checkbox.click();
	
//	List<WebElement>Selday=driver.findElements(By.xpath("//select[@id='day']"));
//	for(WebElement day:Selday) {
//		if(day.getText().equalsIgnoreCase("6"))      
//		day.click();
//	}
	
//	List<WebElement>SelMonth=driver.findElements(By.xpath("//select[@id='month']"));
//	for(WebElement month:SelMonth) {
//		if(month.getText().equalsIgnoreCase("july"))
//			month.click();
//	}
//	
//	List<WebElement>SelYear=driver.findElements(By.xpath("//select[@id='year']"));
//	for(WebElement year:SelYear) {
//		if(year.getText().equalsIgnoreCase("1996"))
//			year.click();
//	}
	
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));

	Select selDay=new Select(day);
	selDay.selectByIndex(6);
	
	Select selMonth=new Select(month);
	selMonth.selectByValue("7");
	
	Select selYear=new Select(year);
	selYear.selectByVisibleText("1996");
}
}
