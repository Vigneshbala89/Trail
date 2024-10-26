package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("headless");
		WebDriver driver=new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
