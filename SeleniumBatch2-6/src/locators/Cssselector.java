package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
	    driver.findElement(By.className("ico-login")).click();
	    driver.findElement(By.id("Email")).sendKeys("viki89@gmail.com");
	    Thread.sleep(5000);
	    driver.findElement(By.id("Password")).sendKeys("Ramar89");
	    Thread.sleep(5000);
	    driver.findElement(By.id("RememberMe")).click();
	    //driver.findElement(By.linkText("Forgot password?")).click();
	    Thread.sleep(10000);
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		Thread.sleep(10000);
		driver.close();

	}

}
