package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://360homedecor.uk/");

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(6000);
        driver.navigate().forward();
        Thread.sleep(6000);
        driver.navigate().refresh();
        
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);

        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length()); 

        driver.quit();

	}

}
