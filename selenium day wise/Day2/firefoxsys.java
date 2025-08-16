package Day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxsys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Java Selenium\\Selenium\\geckodriver-v0.36.0-win-aarch64");
		
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getBrowserVersion();
        System.out.println("Page Title: " + driver.getTitle());
        
        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser version: " + browserVersion);
        driver.quit();

	}

}
