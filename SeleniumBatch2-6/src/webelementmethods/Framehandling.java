package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(3);
		WebElement text = driver.findElement(By.xpath("//p[text()='To leave a comment, click the button below to sign in with Google.']"));
		System.out.println(text.getText());
		driver.switchTo().defaultContent();
		WebElement date = driver.findElement(By.xpath("//time[@title='2019-11-21T22:42:00-08:00']"));
		System.out.println(date.getText());
		driver.close();
	

	}

}
