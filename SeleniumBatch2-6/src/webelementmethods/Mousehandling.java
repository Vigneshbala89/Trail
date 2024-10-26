package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehandling {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement webdriver = driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(webdriver);
		act.perform();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
