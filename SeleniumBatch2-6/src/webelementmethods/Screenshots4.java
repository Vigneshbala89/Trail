package webelementmethods;

import java.io.File;
//import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File ss = ts1.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshot/IRCTCWhole.png");
		FileHandler.copy(ss, path);
		driver.close();

	}

}
