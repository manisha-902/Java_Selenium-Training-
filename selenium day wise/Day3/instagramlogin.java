package Day3;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class instagramlogin {

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace-1\\Selenium_workspace\\src\\config.properties"); 
		props.load(fis);
		String usernameval = props.getProperty("username"); 
		String password =props.getProperty("password"); 
		String url =props.getProperty("url"); 
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
		driver.get(url);
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys(usernameval);
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]/button"));
		loginButton.click();
		
		Thread.sleep(5000);
		
		System.out.println("Login attempt completed.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		
		driver.quit();
		
		}
		
		
		
	}

}
