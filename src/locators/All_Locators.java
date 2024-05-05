package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		//Orange HRM Admin Login
		
		//Using id locator
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		//Using name locator
		
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		
		driver.findElement(By.id("btnLogin")).click();
		
		//Create Admin Account
		
		driver.findElement(By.linkText("Admin")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		Select Usr_role = new Select(driver.findElement(By.id("systemUser_userType")));
		
		Usr_role.selectByVisibleText("Admin");
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Tarak Ramu Inaganti");
		
		Thread.sleep(5);
		
		driver.findElement(By.id("systemUser_userName")).sendKeys("Tarak");
		
		Select status = new Select(driver.findElement(By.id("systemUser_status")));
		
		status.selectByValue("1");
		
		driver.findElement(By.id("systemUser_password")).sendKeys("Qedge@82");
		
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Qedge@82");
		
		driver.findElement(By.id("btnSave")).click();
		
		
		
		
		
		
	}

}
