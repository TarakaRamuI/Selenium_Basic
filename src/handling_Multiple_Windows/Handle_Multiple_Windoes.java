package handling_Multiple_Windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Multiple_Windoes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://gmail.com");	
		driver.findElement(By.linkText("Help")).click();

		//Getting all window is id's and store in a string set
		
		Set<String> allwindows =  driver.getWindowHandles();

		// code to separate window id's 
		
	   //set string is converted into array and stored in object
		
		Object[] windows = allwindows.toArray();
		
		String window1 = windows[0].toString();
		
		String window2 = windows[1].toString();

		//driver switch to focus into second window and perform action
		driver.switchTo().window(window2);
		driver.findElement(By.linkText("Community")).click();

		//And again driver switch to window 1 and perfume the action
		driver.switchTo().window(window1);
		driver.findElement(By.id("identifierId")).sendKeys("demo");

	}

}
