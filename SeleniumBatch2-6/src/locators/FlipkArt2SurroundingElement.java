package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkArt2SurroundingElement {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/hp-15s-2023-intel-core-i3-13th-gen-1315u-8-gb-512-gb-ssd-windows-11-home-15-fd0018tu-thin-light-laptop/p/itmb55564db4e9b4?pid=COMGZVGHGYG4A3V2&lid=LSTCOMGZVGHGYG4A3V21ZDVFF&marketplace=FLIPKART&store=6bo%2Fb5g&srno=b_1_2&otracker=browse&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L1_view-all&fm=organic&iid=en_Y0kgte5GW9HOGSno019SyurtHHJaPc4jhrOjUK3_r820BnEEVLLIamT_2DTvauE8M4Qr_KEuMz1TZhAtSH_GdPUFjCTyOHoHZs-Z5_PS_w0%3D&ppt=hp&ppn=homepage&ssid=aqcf1w5sb40000001717335978257");
		driver.manage().window().maximize();
		String price=driver.findElement(By.xpath("//div[@class='_4WELSP _6lpKCl']/../../../../../../../div[2]/div[2]/div/div[4]/div[1]/div/div[1]")).getText();
		System.out.println(price);
		Thread.sleep(5000);
		driver.close();
		

	}

}
