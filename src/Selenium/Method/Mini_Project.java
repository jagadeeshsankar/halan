package Selenium.Method;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws Throwable {
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement id = driver.findElement(By.id("username"));
		
		id.sendKeys("jagadeeshsai");
		
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.name("password"));
		
		name.sendKeys("jagaa@143sai");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
	
		Select s1 = new Select(location);
		
		s1.selectByVisibleText("Melbourne");
		
		Thread.sleep(2000);
		
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		
		Select s2 = new Select(hotel);
		
		s2.selectByIndex(1);
		
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		
		Select s3 = new Select(room);
		
		s3.selectByValue("Super Deluxe");
		
		WebElement rno = driver.findElement(By.xpath("//select[@id='room_nos']"));
		
		Select s4 = new Select(rno);
		
		s4.selectByIndex(7);
		
		WebElement in_date = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		in_date.sendKeys("0192022");
		
		WebElement out_date = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
		 out_date.sendKeys("0392022");
		 
		 WebElement adult_room  = driver.findElement(By.xpath(" //select[@name='adult_room']"));
		 
		 Select s5 = new Select(adult_room);
		 
		 s5.selectByVisibleText("4 - Four");
		
		 WebElement child_room  = driver.findElement(By.xpath(" //select[@name='child_room']"));
		 
		 Select s6 = new Select(child_room);
		 
		s6.selectByIndex(2);
		
		driver.findElement(By.xpath(" //input[@name='Submit']")).click();
		
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		
		WebElement first_name = driver.findElement(By.xpath("//input[@name='first_name']"));
		
		first_name.sendKeys("jagadeesh");
		
		WebElement last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
		
		last_name.sendKeys("sai");
		
		Thread.sleep(3000);
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		
		address.sendKeys("no/2,ganthipuram bus stop,covai");
		
		WebElement cc = driver.findElement(By.xpath("//input[@name='cc_num']"));
		
		cc.sendKeys("4455332299346587");
		
		WebElement cc_type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		
		 Select s7 = new Select(cc_type);
		 
		 s7.selectByIndex(1);
		 
		 WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		 
		 Select j1 = new Select(month);
		 
		 j1.selectByVisibleText("December");
		 
		 WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		
		 Select j2 = new Select(year);
		 
		 j2.selectByVisibleText("2022");
		 
		 WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		 
		 cvv.sendKeys("123");
		 
		 driver.findElement(By.xpath("//input[@name='book_now']")).click();
		 
		 Thread.sleep(20000);
				 
		 JavascriptExecutor jg = (JavascriptExecutor) driver;
		 
		 jg.executeScript("window.scrollBy(0,200);");
		 
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
		 File destinatoin = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\screenshot\\mini_project.png");
		 
		 FileHandler.copy(source, destinatoin);
	
	}

	}



