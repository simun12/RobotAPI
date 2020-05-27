package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver,chrome,driver", "Macintosh HD⁩ ▸ ⁨Users⁩ ▸ ⁨mohammadhasan⁩ ▸ ⁨Downloads⁩");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.605.tv/");
      driver.findElement(By.xpath("//*[@id=\"footer-links\"]/a[1]")).click();
      
      
	}

}
