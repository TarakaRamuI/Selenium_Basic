package mouse_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://snapdeal.com/");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("Men's Fashion")));
		
		act.build().perform();
		
		
		
	}

}
