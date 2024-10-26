package webelementmethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      TakesScreenshot ts=(TakesScreenshot)driver;
      File ss = ts.getScreenshotAs(OutputType.FILE);
      File path=new File("./Screenshot/DWSWhole.png");
      FileHandler.copy(ss, path);
      driver.close();
	}

}
