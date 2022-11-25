package Selenium.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class basics_class {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hotstar.com/in/subscribe/sign-in");
		
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("phoneNo"));
		
		name.sendKeys("6379394378");
		
		WebElement findElement = driver.findElement(By.className("submit-button"));
		
		
		findElement.click();
		
		
		
		
		
		
	}

}
