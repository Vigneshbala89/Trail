package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkArt1SurroundingElement {

	public static void main(String[] args)throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/hp-victus-intel-core-i7-12th-gen-12650h-16-gb-512-gb-ssd-windows-11-home-6-graphics-nvidia-geforce-rtx-4050-15-fa1134tx-gaming-laptop/p/itm30847354205c8?pid=COMGTT7EGSCCTUJT&lid=LSTCOMGTT7EGSCCTUJTQCKXVY&marketplace=FLIPKART&store=6bo%2Fb5g&srno=b_1_1&otracker=browse&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L1_view-all&fm=organic&iid=en_Y0kgte5GW9HOGSno019SyurtHHJaPc4jhrOjUK3_r81gvaBQd_0ZjvIHpbvNJguKs4pSdwuG48Owk4t5wUDUXg%3D%3D&ppt=hp&ppn=homepage&ssid=aqcf1w5sb40000001717335978257");
	driver.manage().window().maximize();
	String price=driver.findElement(By.xpath("//div[@class='_4WELSP _6lpKCl']/../../../../../../../div[2]/div[2]/div/div[4]/div[1]/div/div[1]")).getText();
	System.out.println(price);
	Thread.sleep(5000);
	driver.close();
		

	}

}
