package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement textbox=driver.findElement(By.name("q"));
		textbox.sendKeys("Advanced Selenium");
		Thread.sleep(5000);
		driver.close();

	}

}
