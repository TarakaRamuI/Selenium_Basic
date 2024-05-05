package selenium_WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		System.out.println("The Title of webpage is :" + driver.getTitle());
		
		System.out.println("The URL of the webpage is :"+driver.getCurrentUrl());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links present in a web page is : "+links.size());
		
		for(int i = 0; i<links.size();i++)
		{
			String link_names = links.get(i).getText();
			
			System.out.println(link_names);
		}

	}

}
