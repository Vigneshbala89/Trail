package webelementmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popuphandling {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		driver.close();
		

	}

}
