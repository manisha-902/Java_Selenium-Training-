package Day2;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class pageloadedge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver = new EdgeDriver(options); 
		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());
		driver.quit();
	}
}
