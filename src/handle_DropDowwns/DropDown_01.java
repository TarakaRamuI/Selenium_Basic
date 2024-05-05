package handle_DropDowwns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Select days = new Select(driver.findElement(By.id("day")));
		
		days.selectByIndex(1);
		
		Select months = new Select(driver.findElement(By.id("month")));
		
		months.selectByVisibleText("May");
		
		Select years = new Select(driver.findElement(By.id("year")));
		
		years.selectByValue("2020");	

	}

}
