package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselection {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement mon = driver.findElement(By.name("Month"));
		Select sel=new Select(mon);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("Ma");
		Thread.sleep(2000);
		sel.selectByVisibleText("May");
		Thread.sleep(2000);
		driver.close();

	}

}
