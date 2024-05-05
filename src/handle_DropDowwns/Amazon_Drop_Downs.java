package handle_DropDowwns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Drop_Downs {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver =  new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		//Counting number Options present in a drop down list
		
		String Item_check = "Books";

		Select droplist = new Select(driver.findElement(By.id("searchDropdownBox")));

		//Getting all of the option present in a drop down list
		
		List<WebElement>catlist = droplist.getOptions();

		System.out.println("total number of options count is: "+catlist.size());

		//Read and print all options (Except *All Categories*) present in a amazon drop down list using for loop

		for(int i=1;i<catlist.size();i++) {

			String mylist = catlist.get(i).getText();

			System.out.println(mylist);	
		}
		
		
		System.out.println("********************Using for each loop print all options present in a drop down list***********");
		
		//Read and print all options present in a amazon drop down list using for each loop
		
		for(WebElement list : catlist) {
			
			String cglist = list.getText();
			
			System.out.println(cglist);
		}
		
		System.out.println("***********Checking praticular value present or not using try catch********");
		
		//Check particular option present in drop down list or not 
		
		try
		{
			droplist.selectByVisibleText(Item_check);
			
			System.out.println(Item_check + " value present is list");
			
		}catch(Exception e)
		{
			System.out.println(Item_check+ " value Not present in a list");
		}
		

	}


}



