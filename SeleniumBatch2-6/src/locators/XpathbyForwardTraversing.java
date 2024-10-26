package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyForwardTraversing {

	public static void main(String[] args)throws Throwable {
		// we are using Xpath by Attribute in Xpathby ForwardTraversing
		//and clicking the Options in Book.Moving from Parent to Immediate Child.
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
