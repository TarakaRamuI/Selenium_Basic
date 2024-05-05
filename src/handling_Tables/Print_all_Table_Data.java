package handling_Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_all_Table_Data {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://flights.qedgetech.com/");
		
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("Flight Bookings")).click();
		
		//Get and print all data present in a table
		
		List<WebElement> table = driver.findElements(By.className("flights_table"));
		
		
		for(WebElement element: table) {
			
			String all_elements = element.getText();
			
			System.out.println(all_elements);
		}
		
		
		
		
		

	}

}
