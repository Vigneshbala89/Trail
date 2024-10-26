package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBySurroundingElement {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String price=driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']/../../div[3]/div[1]/span")).getText();
		System.out.println(price);
		Thread.sleep(5000);
		driver.close();

	}

}
