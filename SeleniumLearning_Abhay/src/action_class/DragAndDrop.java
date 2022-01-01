package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
	WebDriver DnD=new ChromeDriver();
	DnD.get("http://demo.guru99.com/test/drag_drop.html");
	DnD.manage().window().maximize();
	WebElement drag=DnD.findElement(By.xpath("//li[@id='fourth']//a[@class='button button-orange']"));
	WebElement drop=DnD.findElement(By.xpath("//ol[@id='amt7']"));

	Actions act=new Actions(DnD);
	act.dragAndDrop(drag, drop).perform();
}
}
