package Selenium.Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Web_Table {

	public static void main(String[] args) {
  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/table");
		
		driver.manage().window().maximize();
		
		System.out.println("*******All_Data*********");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement all : alldata) {
			String text = all.getText();
			System.out.println(text);	
		}
		System.out.println("******Row_Data*******");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		
		for (WebElement row : rowdata) {
			String rowtext = row.getText();
			System.out.println(rowtext);
			
		}
		System.out.println("******Column_Data*******");
		
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement column : columndata) {
			System.out.println(column.getText());
			
			
			
		}
		System.out.println("******particular web element*******");
		WebElement web_element = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));
		System.out.println(web_element.getText());
		
		System.out.println("******particular_Heading*******");
		
		WebElement heading = driver.findElement(By.xpath("//table/tbody/tr[1]/th[2]"));
		
	    System.out.println(heading.getText());
		
		
		
	}

}
