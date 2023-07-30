package executionPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	static WebDriver driver;
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		String[][] data= {
						{"Admin","Admin1"},
						{"Admin1","admin123"},
						{"admin","Admin123"},
						{"Admin","admin123"}
				
		};
		return data;	
	}
	
	@BeforeTest
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\eclipse-workspace\\Shoban\\SeleniumTest\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(dataProvider = "loginData")
	public void ornHRMDemo(String uName,String pWord) {
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(uName);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(pWord);
		
		WebElement btn = driver.findElement(By.xpath("//*[@type='submit']"));
		btn.click();
	
	}
	
	@AfterTest
	public void browserClose() {
		driver.close();
	}

}
