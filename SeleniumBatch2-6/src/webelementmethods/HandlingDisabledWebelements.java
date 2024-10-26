package webelementmethods;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledWebelements {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement textbox = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(5000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='Selenium';",textbox);
		Thread.sleep(5000);
		driver.quit();

	}

}
