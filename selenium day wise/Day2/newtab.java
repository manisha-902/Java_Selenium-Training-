package Day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Java Selenium\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.youtube.com");
		System.out.println("Page Title(Second Tab): " + driver.getTitle());

		//driver.quit();

	}

}
