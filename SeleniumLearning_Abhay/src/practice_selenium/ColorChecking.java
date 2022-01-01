package practice_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorChecking {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider/#colorpicker");
	driver.manage().window().maximize();
	
	WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(iframe);
	WebElement ColorSlider=driver.findElement(By.xpath("//div[@id='green']//div"));
	String ColorValue=ColorSlider.getCssValue("background-color");
	System.out.println(ColorValue);
	if(ColorValue.equals("rgba(138, 226, 52, 1)")) {
		System.out.println("Test is pass");
	}
	else
		System.out.println("Test is fail");
}
}
