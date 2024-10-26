package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerxpath {

	public static void main(String[] args)throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[1]/input")).click();
        driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Vignesh");
        driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Bala");
        driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("viki90@gmail.com");
        driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("123467");
        driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("123467");
        driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[4]/input")).click();
		Thread.sleep(5000);
		//driver.close();

	}

}
