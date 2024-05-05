package date_and_time_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_DateAndTime_03 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://flights.qedgetech.com/");

		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");

		driver.findElement(By.name("password")).sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.id("search-date")).click();

		//Select one date and store in one String variable
		String dte_fly = "14-May-2025";

		//Separate the date/month/year using string array[] with - (or) / symbol
		String[] temp = dte_fly.split("-");

		//Creating the 3 string variables for date month and year and give the index positions
		
		String date = temp[0];

		String month = temp[1];

		String year = temp[2];
		
		//getting all years and store in a string variable 

		String ylist = driver.findElement(By.className("ui-datepicker-year")).getText();

		//Here while condition checks, If the year is not matching with current year click next until year is matching with current year
		
		while(!ylist.equals(year)) {

			driver.findElement(By.linkText("Next")).click();

			
			ylist = driver.findElement(By.className("ui-datepicker-year")).getText();
		}

		String mlist = driver.findElement(By.className("ui-datepicker-month")).getText();

		
		//Same as month
		while(!mlist.equalsIgnoreCase(month)) {

			driver.findElement(By.linkText("Next")).click();

			mlist = driver.findElement(By.className("ui-datepicker-month")).getText();		
		}

		//Select all tale
		WebElement cal_date = driver.findElement(By.className("ui-datepicker-calendar"));

		//Creating java list for storing list of web element of rows and columns
		List<WebElement> rows,colms;
		
		//getting table rows with table 
		rows = cal_date.findElements(By.tagName("tr"));

		for(int i = 1; i<rows.size();i++) {

			//getting columns data with rows
			colms = rows.get(i).findElements(By.tagName("td"));
			
			//getting all columns data in a table for matching with current date
			for(WebElement element: colms) {

				//if columns date matching with current date then perform click action and break
				if(element.equals(date)) {

					element.click();
					break;
				}

			}

		}




	}

}
