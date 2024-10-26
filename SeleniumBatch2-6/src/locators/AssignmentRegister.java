package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRegister {

	public static void main(String[] args)throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.className("ico-register")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("gender-male")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("FirstName")).sendKeys("Vignesh");
	Thread.sleep(1000);
	driver.findElement(By.id("LastName")).sendKeys("B");
	Thread.sleep(1000);
	driver.findElement(By.id("Email")).sendKeys("viki70@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("Password")).sendKeys("Ramar89");
	Thread.sleep(1000);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Ramar89");
	Thread.sleep(1000);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(1000);
	driver.close();
	

	}

}
