package tables_new;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_all_rowData_Table_03 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.railyatri.in/time-table");
		
		WebElement table =  driver.findElement(By.xpath("//*[@id=\"homepage-main-container\"]/div[2]/div[2]/div/div/div/div/div/table"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++) {
			
			List<WebElement> colms = rows.get(i).findElements(By.tagName("td"));
			
			for(WebElement element : colms) {
				
				System.out.println(element.getText());
			}
		}
		
	}

}
