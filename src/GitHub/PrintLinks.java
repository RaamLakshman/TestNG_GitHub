package GitHub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintLinks {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.12.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are : "+Links.size());
		
		for (int i = 0; i < Links.size(); i++) {
		if(!Links.get(i).getText().isEmpty()) {
		System.out.println(Links.get(i).getText());	
			}
			
		}

	}
}
