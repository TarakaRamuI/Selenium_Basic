package handling_Multiple_Windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_multiple_Window_id {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");		
		driver.findElement(By.linkText("Help")).click();
		
		//To getting all window id and stored in a java set of string 
		Set<String> allwindows =  driver.getWindowHandles();
		
		//Print all window id's
		System.out.println(allwindows);

	}

}
