package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Combinedwebelementmethods {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(1000);
		String registerTitle=driver.getTitle();
		if(registerTitle.contains("Register")) {
			System.out.println("Register page is displayed");
		}
		else {
			System.out.println("Register page is not displayed");
		}
		//driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		String login=driver.getTitle();
		if(login.contains("Login")) {
			System.out.println("Login Page is Displayed");
		}
		else {
			System.out.println("Login Page is not Displayed");
		}
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		Thread.sleep(1000);
		String Books=driver.getCurrentUrl();
		if(Books.contains("books")) {
			System.out.println("Books page is displayed");
		}
		else {
			System.out.println("Books page is not displayed");
		}
		driver.findElement(By.xpath("//a[text()='Health Book']//..//../div[3]/div[2]/input")).click();
	    Thread.sleep(5000);
	    String Healthbook=driver.getCurrentUrl();
	    if(Healthbook.contains("books")) {
	    	System.out.println("Product cart Page is displayed");
	    }
	    else {
	    	System.out.println("Product cart Page is not displayed");
	    }
	    driver.findElement(By.xpath("//span[@class='cart-label' and text()='Shopping cart']")).click();
	    Thread.sleep(1000);
	    String cart=driver.getCurrentUrl();
	    if(cart.contains("cart")) {
	    	System.out.println("Shopping Cart Page is displayed");
	    }
	    else {
	    	System.out.println("Shopping Cart Page is not displayed");
	    }
	    String price = driver.findElement(By.xpath("//span[@class='nobr' and text()='Sub-Total:']//../../../td[2]/span/span")).getText();
	    System.out.println(price);
	  	driver.close();
		

	}

}
