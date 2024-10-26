package webelementmethods;

import java.io.File;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement Heading = driver.findElement(By.xpath("//label[@class='heading-font']"));
		File screenshot = Heading.getScreenshotAs(OutputType.FILE);
		File path = new File("./Screenshot/IRCTC.png");
		FileHandler.copy(screenshot, path);
		driver.quit();
		

	}

}
