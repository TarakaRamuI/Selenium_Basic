package x_path_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Mobiles");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
