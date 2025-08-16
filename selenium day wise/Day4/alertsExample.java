package Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsExample {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://360homedecor.uk");
        driver.findElement(By.xpath("//*[@id=\"check_login\"]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"existed_user_login\"]/div[5]/button")).click();

        
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
       // alertText.sendKeys("Please fill the form");
        System.out.println("Alert Text: " + alertText);
        alert.accept();

        Thread.sleep(2000);
        driver.quit();
	}
}

	
