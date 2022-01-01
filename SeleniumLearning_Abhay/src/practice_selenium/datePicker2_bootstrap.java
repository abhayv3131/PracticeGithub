package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datePicker2_bootstrap {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\abhay\\\\Desktop\\\\Software Testing\\\\SELENIUM\\\\chromedriver.exe");
	WebDriver datepicker2=new ChromeDriver();
	datepicker2.get("http://demo.automationtesting.in/Datepicker.html");
	datepicker2.manage().window().maximize();
	datepicker2.findElement(By.xpath("//*[@id='datepicker2']")).click();
	
	WebElement year=datepicker2.findElement(By.xpath("//select[@title='Change the year']"));
	WebElement month=datepicker2.findElement(By.xpath("//select[@title='Change the month']"));
	Select selYear=new Select(year);
	selYear.selectByVisibleText("1996");

	Select selMonth=new Select(month);
	selMonth.selectByVisibleText("July");
}
}
