package webelementmethods;

import java.io.File;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots5 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3resource.com/index.php");
		WebElement title = driver.findElement(By.xpath("//header[@class='mdl-layout__header']"));
		File screenshot=title.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshot/Javamaterials.png");
		FileHandler.copy(screenshot, path);
		driver.close();
		

	}

}
