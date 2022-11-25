package Selenium.Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement car = driver.findElement(By.xpath("//select[@name='cars']"));
		
		Select c = new Select(car);
		
		boolean mult = c.isMultiple();
		
		System.out.println(mult);
		
		Thread.sleep(2000);
		
		c.selectByIndex(0);
		
		Thread.sleep(2000);
		
		c.selectByValue("opel");
		
		Thread.sleep(2000);
		
		c.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
        WebElement first = c.getFirstSelectedOption();
		
		System.out.println(first.getText());
		
		Thread.sleep(4000);
						
		c.deselectByIndex(0);
		
		Thread.sleep(2000);
		
		c.deselectByValue("opel");
		
		Thread.sleep(2000);
		
		c.deselectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		List<WebElement>  all = c.getAllSelectedOptions();
		
		System.out.println(car.getText());
		

		
		
		
		
	}

}
