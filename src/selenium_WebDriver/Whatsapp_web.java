package selenium_WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp_web {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://web.whatsapp.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.className("_2rQUO")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div/div[3]/div[1]/div[2]/div/div/div/form/input")).sendKeys("9618282463");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div/div[3]/div[2]/button/div/div")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[1]/p")).sendKeys("Sai.Hyd");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Hi, Automation Compleated");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[2]/button/span")).click();
	}
	
}
