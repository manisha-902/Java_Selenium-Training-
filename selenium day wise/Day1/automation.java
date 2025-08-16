package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Java Selenium\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("Wipro");

		searchBox.sendKeys(Keys.RETURN);

		Thread.sleep(200000);
		
		System.out.println("Page Title: " + driver.getTitle());

		driver.quit();
	}

}
