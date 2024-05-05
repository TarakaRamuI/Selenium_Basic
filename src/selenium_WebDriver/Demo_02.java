package selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_02 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		System.out.println("Title = "+ driver.getTitle());
		
		String acttitle = driver.getTitle();
		
		String exptitle = "google";
		
		if(exptitle.equalsIgnoreCase(acttitle))
		{
			System.out.println("Testcase Pass");
		}
		else {
			
			System.out.println("Testcase Faild");
		}
		
		System.out.println("URL = " + driver.getCurrentUrl());
		
		String acturl =  driver.getCurrentUrl();
		
		String expurl = "https://www.Google.com/";
		
		if(acturl.equalsIgnoreCase(expurl))
		{
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Faild");
		}
		driver.close();
	}

}
