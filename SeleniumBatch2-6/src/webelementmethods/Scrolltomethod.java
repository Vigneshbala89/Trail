package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolltomethod {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
		WebElement webelement = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		act.scrollToElement(webelement).perform();
		Thread.sleep(4000);
		driver.quit();
		

	}

}
