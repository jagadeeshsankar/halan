package Selenium.Method;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot_Demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
//		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("jagadeesh");
		
		driver.findElement(By.name("password")).sendKeys("987654321");
		
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		
		login.click();
		
		//TakeScreenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    
	    File destinatoin = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\screenshot\\instagram.png");
	    
	    FileHandler.copy(source, destinatoin);
		
		
	}

	}

