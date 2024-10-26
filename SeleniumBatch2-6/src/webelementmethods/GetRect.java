package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement textbox=driver.findElement(By.id("small-searchterms"));
		 Rectangle Rect = textbox.getRect();
		 System.out.println(Rect.getX());
		 System.out.println(Rect.getY());
		 System.out.println(Rect.getHeight());
		 System.out.println(Rect.getWidth());
		 driver.close();

	}

}
