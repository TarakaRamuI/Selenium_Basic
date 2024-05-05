package date_and_time_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Time_SendKeys_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Pick the date and time using sendKeys
		
		driver.get("http://flights.qedgetech.com/register.html");
	
		driver.findElement(By.id("popupDatepicker")).sendKeys("3-6-2000");
		


	}

}
