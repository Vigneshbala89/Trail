package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginverification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		String login=driver.getTitle();
		if(login.contains("Login")) {
			System.out.println("Login Page is Displayed");
		}
		else {
			System.out.println("Login Page is not Displayed");
		}
		driver.close();

	}

}
