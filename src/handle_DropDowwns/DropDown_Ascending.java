package handle_DropDowwns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Ascending {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		
		Select  drop_list = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));

		List<WebElement> a_list = drop_list.getAllSelectedOptions();
		
		boolean orded = true;
		
		String item1, item2;
		
		for(int i=1;i<a_list.size();i++) {
			
			item1 = a_list.get(i-1).getText();
			
			item2 = a_list.get(i).getText();
			
			if(item1.compareToIgnoreCase(item2)<0) {
				
				orded = false;
				break;
			}
		}
		
		if(orded) {
			
			System.out.println("Items in all drop down list elements are in oredered, Test pass");
		}
		else {
			
			System.out.println("Items in all drop down list elements are not in odrederd, Test fail");
		}
		
		
	}

}
