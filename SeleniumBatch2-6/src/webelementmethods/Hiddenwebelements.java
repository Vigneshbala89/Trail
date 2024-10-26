package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenwebelements {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement ElementDisplayedExample = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ElementDisplayedExample);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value='Selenium';", textbox);
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		Thread.sleep(4000);
		driver.quit();

	}

}
