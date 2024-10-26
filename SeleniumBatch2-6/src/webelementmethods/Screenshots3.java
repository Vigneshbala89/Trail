package webelementmethods;

import java.io.File;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots3 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement Logo1 = driver.findElement(By.xpath("//label[text()='RAIL DRISHTI']"));
		File screenshot=Logo1.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshot/Logo2.png");
		FileHandler.copy(screenshot, path);
		driver.close();
		

	}

}
