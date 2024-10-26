package webelementmethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabHandlinginWindows {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String mainId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		Thread.sleep(2000);
		Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds)
		{
			if(!(id.equals(mainId)))
			{
				driver.switchTo().window(id);
				String url = driver.getCurrentUrl();
				if(url.contains("youtube"))
				{
					System.out.println(url);
				}
				else
				{
					driver.close();
				}
			}
			
		}
		driver.switchTo().window(mainId);
		driver.close();

	}

}
