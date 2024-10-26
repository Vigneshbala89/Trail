package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//we will use for each Loop Concept in tagname Locator
		driver.get("https://demowebshop.tricentis.com/");
        List<WebElement> allLink=driver.findElements(By.tagName("a"));
        for(WebElement link:allLink) {
        	System.out.println(link.getText());
        }
        driver.close();
	}

}
