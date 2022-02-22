package practice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot scShot=(TakesScreenshot)driver;
		File source=scShot.getScreenshotAs(OutputType.FILE);
		File destin=new File("C:\\Users\\abhay\\Desktop\\Software Testing\\Screenshot.png");
		FileHandler.copy(source, destin);
		Thread.sleep(1000);
		driver.quit();
}
}
