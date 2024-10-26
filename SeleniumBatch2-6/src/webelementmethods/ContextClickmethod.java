package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickmethod {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement webdriver = driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a"));
		Actions act=new Actions(driver);
		//act.contextClick(webdriver).perform();
		act.moveToElement(webdriver).contextClick().perform();
		Thread.sleep(2000);
		driver.close();

	}

}
