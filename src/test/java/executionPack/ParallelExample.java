package executionPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExample {

	@Test
	public void google() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\eclipse-workspace\\Shoban\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		long id = Thread.currentThread().getId();
		System.out.println("google id "+id);
	}
	@Test
	public void amazon() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\eclipse-workspace\\Shoban\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		long id = Thread.currentThread().getId();
		System.out.println("amazon id "+id);

	}
	@Test
	public void wikipedia() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\eclipse-workspace\\Shoban\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		long id = Thread.currentThread().getId();
		System.out.println("Wicki id "+id);
	}
	@Test
	public void flipkart() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\eclipse-workspace\\Shoban\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		long id = Thread.currentThread().getId();
		System.out.println("flipkart id "+id);
	}

}
