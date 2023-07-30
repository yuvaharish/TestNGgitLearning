package executionPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationExample {

	static WebDriver driver;

	@Parameters("browserName")
	@Test(priority = 0)
	public void crossBorwser(String name) {
		switch (name) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\jacki\\Downloads\\Compressed\\geckodriver-v0.33.0-win-aarch64//geckodriver.exe");
			// WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}

	}

	@Test(priority = 1)
	public void google() {
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

}
