package Day2;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class pageloadfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions options = new FirefoxOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver = new FirefoxDriver(options); 
		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());
		driver.quit();
	}

}
