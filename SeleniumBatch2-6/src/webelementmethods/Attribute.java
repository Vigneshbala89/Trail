package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) {
		//Fetch the Hover Message
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement language=driver.findElement(By.xpath("//a[@title='Gujarati']"));
		System.out.println(language.getAttribute("title"));
		driver.close();

	}

}
