package selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
	
		driver.findElement(By.id("email")).sendKeys("tarakaramuinaganti@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("");
		
		driver.findElement(By.name("login")).click();
		

	}

}
