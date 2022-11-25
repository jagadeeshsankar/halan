package Selenium.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {

	public static void main(String[] args) throws InterruptedException {
         
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://telegr.am/user_mgt/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//basic x-path
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		
		username.sendKeys("dharunyadoll");
		
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		password.sendKeys("123456789");
		
		Thread.sleep(1000);
		
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		check.click();
		
		Thread.sleep(2000);
		
		//contains x-path(1)
		
		WebElement sub = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		
		sub.click();
		
		Thread.sleep(3000);
		
		//contains and text(1)
		WebElement recover = driver.findElement(By.xpath("//a[contains(text(),'Recover')]"));
		
		recover.click();
		
		Thread.sleep(2000);
		
		//contains x-path(2,3)
		WebElement email = driver.findElement(By.xpath("//input[contains(@class,'email')]"));
		
		email.sendKeys("dharunyadoll@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement type = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		
		type.click();
		
		
		
		
		
		
	}

}
