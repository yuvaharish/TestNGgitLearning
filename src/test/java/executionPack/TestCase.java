package executionPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase {
	
	static WebDriver driver;
	long startTime;
	@BeforeSuite
	public void openBorwser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\eclipse-workspace\\Shoban\\SeleniumTest\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closeBorser() {
		driver.close();
		long endTime = System.currentTimeMillis();
		long totalTime = startTime - endTime;
		System.out.println("overal Time :" + totalTime);
	}

	@Test
	public void google() {
		long startTime = System.currentTimeMillis();
		
		driver.get("https://www.google.com/");
		
		long endTime = System.currentTimeMillis();
		long totalTime = startTime - endTime;
		System.out.println("google Time :" + totalTime);
	}

	@Test
	public void wickie() {
		long startTime = System.currentTimeMillis();
		
		driver.get("https://www.wikipedia.org/");
		
		long endTime = System.currentTimeMillis();
		long totalTime = startTime - endTime;
		System.out.println("wicki Time " + totalTime);
	}

	@Test
	public void bing() {
		long startTime = System.currentTimeMillis();
		
		driver.get("https://www.bing.com/");
		
		long endTime = System.currentTimeMillis();
		long totalTime = startTime - endTime;
		System.out.println("Bing Time : " + totalTime);
	}
}
