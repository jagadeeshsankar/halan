package com.selenium.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.schema.SelectedField;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior;

public class Alart_Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		Thread.sleep(3000);
		
		//driver.get("https://demoqa.com/alertsWindows");
		
		WebElement al = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]"));
		
		al.submit();
		
	
		
	}

}
