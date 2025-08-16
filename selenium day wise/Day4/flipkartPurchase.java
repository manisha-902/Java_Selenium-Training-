package Day4;
import java.io.FileInputStream;
import java.time.Duration;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class flipkartPurchase {

	public static void main(String[] args)throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace-1\\Selenium_workspace\\src\\config.properties");
		props.load(fis);
		String username = props.getProperty("username");
		String url = props.getProperty("url");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.get(url);
			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
			// driver.get("https://www.flipkart.com/account/login?ret=/");

		        WebElement mobileField = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"));
		        mobileField.sendKeys(username);

		        WebElement requestOTP = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button"));
		        requestOTP.click();
		        
		        Thread.sleep(20000);
		        
		        WebElement searchBox = driver.findElement(By.name("q")); // Flipkart search box has name="q"
		        searchBox.sendKeys("laptop");
		        
		        driver.findElement(By.xpath("//button[@type='submit']")).click();

		        Thread.sleep(3000);
		        
		        WebElement firstProduct = driver.findElement(By.className("_75nlfw"));
		        firstProduct.click();

		        Thread.sleep(3000);
		        
		        for (String handle : driver.getWindowHandles()) {
		            driver.switchTo().window(handle);
		        }

		        WebElement addToCart = driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
		        addToCart.click();

		        Thread.sleep(3000);

	        
		}
		finally {
			driver.quit();
	}

		}
	}
