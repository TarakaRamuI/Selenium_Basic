package handle_DropDowwns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_ele_dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver =  new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		String Item_check = "Books";
		
		Select list = new Select(driver.findElement(By.id("searchDropdownBox")));
		
		List<WebElement> catlist = list.getOptions();
		
		for(WebElement alist : catlist) {
			
			String getlist = alist.getText();
			
			System.out.println(getlist);
			
		}
		
		
		try {
			
			list.selectByVisibleText(Item_check);
			
			System.out.println(Item_check+ " :value present in a list");
			
			
		} catch (Exception e) {
			
			System.out.println(Item_check + ":value not present in a list ");
		}
		
	}

}
