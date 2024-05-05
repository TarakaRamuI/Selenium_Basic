package scroll_a_Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrool_Visibility_of_Element {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://booking.com");
		
		driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']")).click();
		
		//webdriver object is converted into javascript type
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeAsyncScript("arguments[0].scrollIntoView()",driver.findElement(By.id("newsletter_button_footer")));

	}

}
