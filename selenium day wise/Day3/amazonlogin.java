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

public class amazonlogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace-1\\Selenium_workspace\\src\\config.properties");
		props.load(fis);
		String usernameval = props.getProperty("username");
		String password = props.getProperty("password");
		String url = props.getProperty("url");
		String text = props.getProperty("text");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.get(url);
			driver.findElement(By.id("nav-link-accountList")).click();
			WebElement usernameField = driver.findElement(By.name("email"));
			usernameField.sendKeys(usernameval);
			WebElement loginButton1 = driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input"));
			loginButton1.click();
			WebElement passwordField = driver.findElement(By.id("ap_password"));
			passwordField.sendKeys(password);

			WebElement loginButton2 = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
			loginButton2.click();
			
			Thread.sleep(2000);
			
			/*WebElement loginButton3 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
			loginButton3.click();*/
			
			WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
			Search.sendKeys(text);
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(2000);
			
			try {
			    WebElement specificMobile = driver.findElement(By.cssSelector("#a-autoid-5-announce"));
			    specificMobile.click();
			    System.out.println("Clicked on the specific mobile product.");
			} catch (Exception e) {
			    System.out.println("Could not find the specific mobile product.");
			    return;
			}
			driver.findElement(By.id("add-to-cart-button")).click();
			 Thread.sleep(2000);
	        System.out.println("Item added to cart successfully!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
