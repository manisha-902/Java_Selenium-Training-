package Day4;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class bookanappointment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://360homedecor.uk/book-appointment");
		 
	     WebElement serviceDropdown = driver.findElement(By.id("choose_branch"));
	     Select select = new Select(serviceDropdown);
	     select.selectByValue("marquis_manor");
	     Thread.sleep(3000);
	     
	     WebElement serviceDropdown1 = driver.findElement(By.id("choose_style"));
	     Select Select1 = new Select(serviceDropdown1);
	     Select1.selectByValue("contemporary");
	     Thread.sleep(3000);
	     
	     driver.findElement(By.id("first_name")).sendKeys("Manisha");
	     driver.findElement(By.id("last_name")).sendKeys("Sahoo");
	     driver.findElement(By.id("apt_city")).sendKeys("Bhubaneswar");
	     driver.findElement(By.id("phone_number")).sendKeys("9832963909");
	     driver.findElement(By.id("email")).sendKeys("manisha@gmail.com");
	     
	     WebElement uploadResumeButton = driver.findElement(By.id("layoutFiles"));
			File resumeFile = new File("C:\\Users\\HP\\Downloads\\Manisha_sahoo_CV.pdf");
			uploadResumeButton.sendKeys(resumeFile.getAbsolutePath());
			
			/*WebElement privacyCheckbox = driver.findElement(By.className("privacyPolicy"));

			if (!privacyCheckbox.isSelected()) {
			    privacyCheckbox.click();  
			} else {
			    System.out.println("Privacy Policy checkbox is already checked");
			}*/
			WebElement bookBtn = driver.findElement(By.xpath("//*[@id=\"appointment_form\"]/div[10]/button"));
			bookBtn.click();
			Thread.sleep(3000);
	     
	     driver.quit();
	}

}
