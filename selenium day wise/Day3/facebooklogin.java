package Day3;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
public class facebooklogin {

	public static void main(String[] args)  throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Java Selenium\\Selenium\\edgedriver_win64\\msedgedriver.exe");

		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace-1\\Selenium_workspace\\src\\config.properties"); 
		props.load(fis);
		String usernameval = props.getProperty("username"); 
		String password =props.getProperty("password"); 
		String url =props.getProperty("url"); 
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
		driver.get(url);
		WebElement usernameField = driver.findElement(By.name("email"));
		usernameField.sendKeys(usernameval);
		WebElement passwordField = driver.findElement(By.name("pass"));
		passwordField.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		Thread.sleep(5000);
		
		System.out.println("Login attempt completed.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		
		
		}

	}

}
