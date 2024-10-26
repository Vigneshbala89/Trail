package webelementmethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("Vignesh");
		Thread.sleep(5000);
		alt.accept();
		Thread.sleep(5000);
		driver.quit();

	}

}
