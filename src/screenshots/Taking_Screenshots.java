package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taking_Screenshots {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		driver.findElement(By.linkText("Change Password")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File trg = new File("C:\\Users\\user\\OneDrive\\Desktop\\All_Projects\\Z.QEdge_Selenium\\change_pwd_defect.png");
		
		FileUtils.copyFile(src, trg);
		
		
		

	}

}
