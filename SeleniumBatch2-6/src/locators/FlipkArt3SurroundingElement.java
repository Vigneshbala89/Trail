package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkArt3SurroundingElement {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/lenovo-v15-amd-ryzen-3-quad-core-7320u-8-gb-512-gb-ssd-windows-11-home-g4-amn-1-thin-light-laptop/p/itm5819401743e27?pid=COMGPYKZAWY8UX6C&lid=LSTCOMGPYKZAWY8UX6CSCLSXL&marketplace=FLIPKART&store=6bo%2Fb5g&srno=b_1_3&otracker=browse&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L1_view-all&fm=organic&iid=46a54494-b8e1-47c5-848a-f7dc8da23d85.COMGPYKZAWY8UX6C.SEARCH&ppt=hp&ppn=homepage&ssid=aqcf1w5sb40000001717335978257");
		driver.manage().window().maximize();
		String price=driver.findElement(By.xpath("//div[@class='_4WELSP _6lpKCl']/../../../../../../../div[2]/div[2]/div/div[4]/div[1]/div/div[1]")).getText();
		System.out.println(price);
		Thread.sleep(5000);
		driver.close();
		

	}

}
