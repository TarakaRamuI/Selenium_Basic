package tables_new;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_num_of_colms_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.railyatri.in/time-table");
		
		// Select the Table for counting number of columns present in a table
		
		WebElement table = driver.findElement(By.className("table-responsive"));
		
		// Creating java list for counting a columns in a table
		List<WebElement> rows , colms;
		
		rows = table.findElements(By.tagName("tr"));
		
		colms = rows.get(1).findElements(By.tagName("td"));
		
		System.out.println("Number of columns present in a table: "+colms.size());
		
		System.out.println("********Columns data present in table*******");
		
		//print column data
		
		for(int i =0;i<colms.size();i++) {
			
			String all_colms = colms.get(i).getText();
			
			
			System.out.println(all_colms);
		}

	}

}
