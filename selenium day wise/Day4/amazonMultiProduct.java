package Day4;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazonMultiProduct {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace-1\\Selenium_workspace\\src\\config.properties");
		props.load(fis);
		String usernameval = props.getProperty("username");
		String password = props.getProperty("password");
		String url = props.getProperty("url");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.get(url);
			driver.findElement(By.id("nav-link-accountList")).click();
			driver.findElement(By.name("email")).sendKeys(usernameval);
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys(password);
			driver.findElement(By.id("signInSubmit")).click();

			Thread.sleep(2000);

			List<String> products = new ArrayList<>();
			products.add("laptop");
			products.add("headphones");
			products.add("wireless mouse");

			for (String product : products) {

				WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
				searchBox.clear();
				searchBox.sendKeys(product);
				driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(3000);

				WebElement firstProduct = driver.findElement(By.cssSelector("#a-autoid-3-announce"));
				firstProduct.click();
				Thread.sleep(3000);
			}

			WebElement addToCartBtn = driver.findElement(By.id("add-to-cart-button"));
			addToCartBtn.click();
			Thread.sleep(2000);

		} finally {
			driver.quit();
		}

	}
}


