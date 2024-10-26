package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement textbox=driver.findElement(By.id("small-searchterms"));
		Point point = textbox.getLocation();
		Thread.sleep(3000);
       System.out.println(point.getX());
       Thread.sleep(3000);
       System.out.println(point.getY());
       Thread.sleep(3000);
       driver.close();
		
	}

}
