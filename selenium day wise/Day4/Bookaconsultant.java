package Day4;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Bookaconsultant {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://360homedecor.uk/design-consultation");
		 
		 WebElement contemporaryImg = driver.findElement(By.xpath("//img[@alt='Contemporary Style']"));
		 contemporaryImg.click();
		  Thread.sleep(2000);
		 WebElement serviceDropdown = driver.findElement(By.id("chooseMethod"));
	     Select select = new Select(serviceDropdown);
	     select.selectByValue("showroom");
	     Thread.sleep(3000);
	     
	     WebElement serviceDropdown1 = driver.findElement(By.id("chooseShowroom"));
	     Select Select1 = new Select(serviceDropdown1);
	     Select1.selectByValue("4|Qatar");
	     Thread.sleep(3000);
	     
	     driver.findElement(By.id("firstName")).sendKeys("Manisha");
	     driver.findElement(By.id("lastName")).sendKeys("Sahoo");
	     driver.findElement(By.id("city")).sendKeys("Bhubaneswar");
	     driver.findElement(By.id("phoneNumber")).sendKeys("9832963909");
	     driver.findElement(By.id("email")).sendKeys("manisha@gmail.com");
	     
	     WebElement bookBtn = driver.findElement(By.xpath("//*[@id=\"consultation_form\"]/button"));
			bookBtn.click();
			Thread.sleep(3000);
	     System.out.println("Succesfull!");
	     driver.quit();
	  
	     

	}

}
