package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement dragelement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropelement = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		act.clickAndHold(dragelement).moveToElement(dropelement).release().perform();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
