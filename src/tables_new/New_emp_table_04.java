package tables_new;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_emp_table_04 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("PIM")).click();

		driver.findElement(By.linkText("Add Employee")).click();

		driver.findElement(By.id("firstName")).sendKeys("Adithya");

		driver.findElement(By.id("firstName")).sendKeys("varma");

		driver.findElement(By.id("lastName")).sendKeys("MM");

		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");

		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.linkText("Employee List")).click();

		driver.findElement(By.id("empsearch_id")).sendKeys(empid);

		driver.findElement(By.id("searchBtn")).click();

		WebElement EMP_table = driver.findElement(By.id("resultTable"));

		List<WebElement> rows = EMP_table.findElements(By.tagName("tr"));

		for(int i=1;i<rows.size();i++) {

			List<WebElement> colms = rows.get(i).findElements(By.tagName("td"));

			if(colms.get(1).getText().equals(empid)) {

				System.out.println("Test Pass");

			}else {

				System.err.printf("Test Fail");
			}
		}
	}





}


