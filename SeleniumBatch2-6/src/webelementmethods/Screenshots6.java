package webelementmethods;

import java.io.File;
//import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots6 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		TakesScreenshot ts3=(TakesScreenshot)driver;
		File ss=ts3.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshot/MakemyTripwhole.png");
		FileHandler.copy(ss, path);
		driver.close();

	}

}
