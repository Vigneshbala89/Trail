package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement textbox=driver.findElement(By.id("small-searchterms"));
		Dimension size = textbox.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.close();
		

	}

}
