package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_and_DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
		WebDriver RightandDouble=new ChromeDriver();
		RightandDouble.get("http://demo.guru99.com/test/simple_context_menu.html");
		RightandDouble.manage().window().maximize();
		
		WebElement RightClick=RightandDouble.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(RightandDouble);
//		act.contextClick(RightClick).perform();
		Thread.sleep(1000);
		WebElement DoubleClick=RightandDouble.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(DoubleClick).perform();

}
}
