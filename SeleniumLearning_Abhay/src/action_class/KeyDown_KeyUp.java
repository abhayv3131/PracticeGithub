package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_KeyUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhay\\Desktop\\Software Testing\\SELENIUM\\chromedriver.exe");
		WebDriver CopyPaste=new ChromeDriver();
		CopyPaste.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		CopyPaste.manage().window().maximize();
		WebElement UsernameText=CopyPaste.findElement(By.id("txtUsername"));
		UsernameText.sendKeys("Abhay");
		Thread.sleep(1000);
		Actions act=new Actions(CopyPaste);
		UsernameText.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);

		WebElement PasswordText=CopyPaste.findElement(By.id("txtPassword"));
		PasswordText.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);

}
}
