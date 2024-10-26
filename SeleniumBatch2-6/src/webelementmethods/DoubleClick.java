package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
		WebElement webdriver = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions act=new Actions(driver);
		act.doubleClick(webdriver).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
