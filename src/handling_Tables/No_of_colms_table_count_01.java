package handling_Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_colms_table_count_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.railyatri.in/time-table");
		
		WebElement table = driver.findElement(By.className("table-responsive"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		List<WebElement> colms = rows.get(0).findElements(By.tagName("th"));
		
		System.out.println("Number of columns: "+colms.size());
		
		for(int i =0;i<colms.size();i++) {
			
			String names = colms.get(i).getText();
			
			System.out.println(names);
		}
		
		
		
	}

}
