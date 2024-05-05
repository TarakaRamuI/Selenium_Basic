package selenium_WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Delete all cookies 
		driver.manage().deleteAllCookies();
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		//Open Web page URL
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMI-vvfjIawhAMVzACtBh1vaAllEAAYASAAEgJ2FvD_BwE%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9062137%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D1737190274470600390%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		//print title of the web Page
		System.out.println("Current web page title is: "+driver.getTitle());
		
		//Print web page URL
		System.out.println("Current web page URL is: "+driver.getCurrentUrl());
		
		
		//Finding how many web links present in a web page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The total number of links are: "+links.size());
		
		//Print all web elements present in a web page
		for(int i=0;i<links.size();i++)
		{
			String link_names = links.get(i).getText();
			
			System.out.println("List of the link names: "+link_names);
		}
		
		//Getting one particular element in list present in a web page and print it

		String element = links.get(2).getText();
		
		System.out.println("The particular web element name is: "+element);
		
		
		
		//close the current web page
		
		driver.close();
		

	}

}
