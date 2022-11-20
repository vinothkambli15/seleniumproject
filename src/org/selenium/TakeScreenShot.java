package org.selenium;

import java.awt.Desktop.Action;
import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakeScreenShot {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver w = new ChromeDriver();
	w.get("http://greenstech.in/selenium-course-content.html");
	
	w.manage().window().maximize();
	
	
	
	WebElement flip = w.findElement(By.xpath("//span[@class='address-align'][1]"));

     
	JavascriptExecutor js = (JavascriptExecutor)w;
	
	
	js.executeScript("arguments[0].scrollIntoView()",flip);
	
	
	
	
}

}

