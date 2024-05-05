package handling_Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Two_Columns_02 {

	public static void main(String[] args) {
		
		//A Program to read all train numbers and train names present in a table
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.railyatri.in/time-table");
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"homepage-main-container\"]/div[2]/div[2]/div/div/div/div/div/table"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i = 1; i<rows.size();i++) {
			
			List<WebElement> colms = rows.get(i).findElements(By.tagName("td")); 
			
			String train_numbes = colms.get(0).getText();
			
			String train_names = colms.get(1).getText();
			
			
			System.out.println(train_numbes+"   "+train_names);
		}

	}

}
