package webelementmethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptRunner {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(4000);
		driver.close();

	}

}
