package advancedSelenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		//give the path
		
		FileInputStream path=new FileInputStream("./Data/AdvancedSelenium.properties");
		//create the object of properties class
		Properties obj=new Properties();
		//load the properties
		obj.load(path);
		//fetch the properties
		String url=obj.getProperty("url");
		String un=obj.getProperty("username");
		String pwd=obj.getProperty("password");
		//System.out.println(url);
		//System.out.println(un);
		//login operation
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.name("Password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		

	}

}
