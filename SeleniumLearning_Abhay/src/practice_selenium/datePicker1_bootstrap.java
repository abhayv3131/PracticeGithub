package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker1_bootstrap {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abhay\\\\Desktop\\\\Software Testing\\\\SELENIUM\\\\chromedriver.exe");
	WebDriver datepicker=new ChromeDriver();
	datepicker.get("http://demo.automationtesting.in/Datepicker.html");
	datepicker.manage().window().maximize();
	
	WebElement date=datepicker.findElement(By.id("datepicker1"));
	date.click();
	
	int i=0;
	while(i==0) {
		WebElement text=datepicker.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
		String abc=text.getText();
		if(!(abc.equals("July 1996"))) {
			datepicker.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		else {
			break;
		}
	}
	
	datepicker.findElement(By.xpath("//tbody//tr//td//a[text()='6']")).click();
}
}
