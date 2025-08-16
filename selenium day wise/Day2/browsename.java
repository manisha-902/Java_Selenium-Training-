package Day2;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browsename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Java Selenium\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getBrowserVersion();
		
        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser version: " + browserVersion);
        driver.quit();
	}

	

}

/*Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
String browserName = caps.getBrowserName();
String browserVersion = caps.getBrowserVersion();*/
