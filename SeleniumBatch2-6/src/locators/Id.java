package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement textBox=driver.findElement(By.id("small-searchterms"));
		textBox.sendKeys("Selenium");
		Thread.sleep(5000);
		driver.close();

	}

}
