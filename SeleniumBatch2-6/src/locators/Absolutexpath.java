package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {

	public static void main(String[] args)throws Throwable {
		//for search store Textbox in Demo Web Shop
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[3]/form/input[1]")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.close();

	}

}
