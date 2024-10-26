package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		//driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.linkText("Log in")).click();
		WebElement rememberme=driver.findElement(By.id("RememberMe"));
		System.out.println(rememberme.isSelected());
		rememberme.click();
		System.out.println(rememberme.isSelected());
		driver.close();
		
		
		
		

	}

}
