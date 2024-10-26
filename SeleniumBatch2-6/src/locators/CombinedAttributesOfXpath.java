package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CombinedAttributesOfXpath {

	public static void main(String[] args)throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.className("ico-register")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("gender-male")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("FirstName")).sendKeys("Vigneshbala");
	Thread.sleep(1000);
	driver.findElement(By.id("LastName")).sendKeys("B");
	Thread.sleep(1000);
	driver.findElement(By.id("Email")).sendKeys("vicky52@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("Password")).sendKeys("Balan901");
	Thread.sleep(1000);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Balan901");
	Thread.sleep(1000);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(1000);
	driver.findElement(By.className("ico-login")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("Email")).sendKeys("vicky52@gmail.com");
    Thread.sleep(1000);
    driver.findElement(By.id("Password")).sendKeys("Balan901");
    Thread.sleep(1000);
    //driver.findElement(By.xpath("//input[@value='Continue']")).click();
  //Thread.sleep(1000);
    //driver.findElement(By.id("RememberMe")).isSelected();
    //Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@value='Log in']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[text()='Health Book']//..//../div[3]/div[2]/input")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[@class='cart-label' and text()='Shopping cart']")).click();
    Thread.sleep(1000);
    String price=driver.findElement(By.xpath("//span[@class='nobr' and text()='Sub-Total:']//../../../td[2]/span/span")).getText();
   // Thread.sleep(1000);
    System.out.println(price);
    driver.findElement(By.xpath("//a[@class='ico-logout' and text()='Log out']")).click();
    //Thread.sleep(1000);
    driver.close();
 	}
}
