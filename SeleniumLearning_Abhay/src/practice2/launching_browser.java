package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launching_browser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	
	String title=driver.getTitle();
	if(title.equalsIgnoreCase("Orang")) {
		System.out.println("test is passed "+title);
	}
	else
		System.out.println("test is failed");
	String url=driver.getCurrentUrl();
	if(url.equalsIgnoreCase("https://o-demo.orangehrmlive.com/")) {
		System.out.println("test is passed "+url);
	}
	else
		System.out.println("test is failed");
}
}
