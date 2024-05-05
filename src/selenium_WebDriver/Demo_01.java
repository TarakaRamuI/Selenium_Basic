package selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get("http://www.google.com");

		System.out.println("The First Title is :" + driver.getTitle());

		if (driver.getTitle().equalsIgnoreCase("google")) {
			
			System.out.println("Title Matched, Testcase Pass");
			
		} else {
			System.out.println("Title Not Matched, Testcase Fail");
		}

		System.out.println("The First  URL is :" + driver.getCurrentUrl());

		if(driver.getCurrentUrl().equalsIgnoreCase("https://WWW.Google.COM/"))
		{
			System.out.println("The URL Matched, Tesetcase Pass");
		}
		else {

			System.out.println("Thr URL not Matched, Testcase Fail");
		}


		driver.navigate().to("http://www.facebook.com");

		System.out.println(driver.getTitle());

		if(driver.getTitle().equalsIgnoreCase("Facebook – log in or sign up"))
		{
			System.out.println("second page is matched , Testcase Pass");
		}
		else{
			System.out.println("second page is not matched , Testcase Fail");
		}


		System.out.println(driver.getCurrentUrl());

		if(driver.getCurrentUrl().equalsIgnoreCase("https://WWW.FACEBOOK.COM/"))
		{
			System.out.println("second page URL matched testcase pass");
		}

		else {

			System.out.println("second page URL not matched , Testcase Faild");
		}

		/*
		 * Thread.sleep(2000);
		 * 
		 * driver.navigate().back();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.navigate().forward();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.navigate().refresh();
		 * 
		 * driver.findElement(By.linkText("Create a Page")).click();
		 */
		driver.close();


	}

}
