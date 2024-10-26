package webelementmethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//save the webelement
		WebElement title=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		File screenshot=title.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshot/Demo.png");
		FileHandler.copy(screenshot, path);
		driver.quit();

	}

}
