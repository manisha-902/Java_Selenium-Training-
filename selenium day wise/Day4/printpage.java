package Day4;
import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PageSize;
import org.openqa.selenium.print.PrintOptions;
//import org.openqa.selenium.print.PageMargin;
//import org.openqa.selenium.print.PageSize;

public class printpage {

	private static final String Assertions = null;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		String pageTitle = driver.getTitle();
        String pageURL = driver.getCurrentUrl();
        
        System.out.println("Page Title: " + pageTitle);
        System.out.println("Page URL: " + pageURL);
        
        PrintOptions printOptions = new PrintOptions();
        printOptions.setOrientation(PrintOptions.Orientation.LANDSCAPE);
        PrintOptions.Orientation current_orientation = printOptions.getOrientation();
        System.out.println("Current Orientation: " + current_orientation);
        
        printOptions.setPageRanges("1-5");
        String[] current_range = printOptions.getPageRanges();
        System.out.println(Arrays.toString(current_range));
        
        printOptions.setPageSize(new PageSize(27.94, 21.59)); 
        double currentHeight = printOptions.getPageSize().getHeight();
        System.out.println(currentHeight);
        
        
        
        /*System.out.println("Default Page Size: " + printOptions.getPageSize());
        System.out.println("Default Page Margins: " + printOptions.getPageMargin());
        System.out.println("Default Page Ranges: " + printOptions.getPageRanges());
        System.out.println("Default Page Background: " + printOptions.getBackground());
        System.out.println("Default Page Scale: " + printOptions.getScale());
        System.out.println("Default Page ShrinkToFit: " + printOptions.getShrinkToFit());*/
        
       
        
        driver.quit();
	}

}
