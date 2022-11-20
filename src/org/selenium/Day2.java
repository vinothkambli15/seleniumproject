package org.selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver w = new ChromeDriver();
	
	w.get("https://www.facebook.com//");
	w.manage().window().maximize();
   
  w.manage().window().maximize();
  
  WebElement tex = w.findElement(By.xpath("//a[text()='Create New Account']"));
  tex.click();
  
  Thread.sleep(2000);
  
   WebElement name = w.findElement(By.name("firstname"));
   name.sendKeys("vinoth");
   WebElement name1 = w.findElement(By.xpath("//input[@name='lastname']"));
   name1.sendKeys("kambli");
   WebElement mob = w.findElement(By.id("text"));
   mob.sendKeys("9500383637");
   Thread.sleep(2000);
WebElement click = w.findElement(By.name("websubmit"));
click.click();
}
}
