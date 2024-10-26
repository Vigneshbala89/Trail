package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//This is the method used for Maximising the Current Window
		//we are opening.
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");

	}

}
