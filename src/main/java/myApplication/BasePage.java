package myApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	public static WebDriver driver;
	public String browser = "firefox";

	public BasePage() {
		if (driver == null) {
			if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver","D:\\Eclipse\\geckodriver-v0.25.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");

		}
	}
	
	public String getTitle1()
	{
		return driver.getTitle();
	}
}

