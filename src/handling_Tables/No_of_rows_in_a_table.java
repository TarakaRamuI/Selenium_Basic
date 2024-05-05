package handling_Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_rows_in_a_table {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.railyatri.in/time-table");
		
		WebElement table =  driver.findElement(By.xpath("//*[@id=\"homepage-main-container\"]/div[2]/div[2]/div/div/div/div/div/table"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		//Here 0th row is heading row that's why we take tag name<th> (Table Header)
		
		List<WebElement> colms_01 = rows.get(0).findElements(By.tagName("th"));
		
		System.out.println("Number of columns present in a first row of a table: "+colms_01.size());
		
		//Here 1st row of a table is normal row we taking tag name <td> (Table Data)
		
		List<WebElement> colms_02 = rows.get(1).findElements(By.tagName("td"));
		
		System.out.println("Number of columns present in a second row of a table: "+colms_02.size());
	}

}
