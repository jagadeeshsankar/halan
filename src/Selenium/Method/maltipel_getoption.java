package Selenium.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class maltipel_getoption {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement find = driver.findElement(By.xpath("//div[@id='withOptGroup']"));
		
		find.click();
		
		WebElement one = driver.findElement(By.xpath("//div[@id='selectOne']"));
		
		one.click();
		
		
		
		
		
	}

}
