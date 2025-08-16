package Day3;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
//import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		/*
		 * Properties props = new Properties(); FileInputStream fis = new
		 * FileInputStream("src/test/resources/config.properties"); props.load(fis);
		 * 
		 * String email = props.getProperty("naukri.email"); String password =
		 * props.getProperty("naukri.password"); String resumePath =
		 * props.getProperty("resume.path"); String chromeDriverPath =
		 * props.getProperty("chromedriver.path");
		 */
		try {

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.naukri.com/nlogin/login");


			driver.findElement(By.id("usernameField")).sendKeys("manishasahoo902@gmail.com");
			driver.findElement(By.id("passwordField")).sendKeys("Manisha@902");
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();
	
			Thread.sleep(5000);
			
			driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
			WebElement uploadResumeButton = driver.findElement(By.id("attachCV"));
			File resumeFile = new File("C:\\Users\\HP\\Downloads\\Manisha_sahoo_CV.pdf");
			uploadResumeButton.sendKeys(resumeFile.getAbsolutePath());
			
			Thread.sleep(5000);
			
			System.out.println("Resume uploaded successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}
}
