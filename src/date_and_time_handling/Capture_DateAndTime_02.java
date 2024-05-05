package date_and_time_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Capture_DateAndTime_02 {

	public static void main(String[] args) {

		System.setProperty("webdrive.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://flights.qedgetech.com/");

		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.name("dob")).click();
		
		String dob = "14-Oct-1996";
		
		String[] temp = dob.split("-");
		
		String date = temp[0];
		
		String month = temp[1];
		
		String year = temp[2];
		
		// Code for getting a particular month and year in a month and year drop down list
		
		Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		
		mlist.selectByVisibleText(month);
		
		Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		
		ylist.selectByVisibleText(year);

		// Code for pick the particular date in a calendar table
		
		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		
		rows = cal.findElements(By.tagName("tr"));
		
		//getting rows and columns in a calendar and ignoring first row it is table head
		
		for(int i=1;i<rows.size();i++) {
			
			cols = rows.get(i).findElements(By.tagName("td"));
			
		  // Using for each loop for getting all columns in a calendar table
			
			for(WebElement element : cols) {
				
				if(element.equals(date)) {
					
					element.click();
					break;
				}
			}
			
		}
		
		
		
		
		
		
		


	}


}


