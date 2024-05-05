package ajax_Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaX_Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");

		System.out.println("Webpage Title is :"+driver.getTitle());

		System.out.println("Webpage URL is :"+driver.getCurrentUrl());

		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(200);

		//Capturing and Storing  all suggested elements in google search box in java list
		
		List<WebElement> ajax_list = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		
		//printing all suggested elements size in console
		
		System.out.println(ajax_list.size());
		
		//Print all captured suggested element in a java list
		
		//By using For each loop
		
		for(WebElement element: ajax_list) {
			
			String key_list = element.getText();
			
			System.out.println(key_list);
			
			//I wan to click particular element in a suggested list 
			
			if(key_list.contentEquals("selenium download")) {
				
				element.click();
			}
		}


		}
	}




