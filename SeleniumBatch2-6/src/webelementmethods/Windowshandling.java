package webelementmethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String mainId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> allId = driver.getWindowHandles();
		for(String id:allId)
		{
			if(!(id.equals(mainId)))
			{
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
			}
		}
		driver.switchTo().window(mainId);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}
