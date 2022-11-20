package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver w = new ChromeDriver();
    
    w.get("http://www.facebook.com//");
    
    w.manage().window().maximize();
    
  
    
  WebElement courses = w.findElement(By.xpath("//h2[@class='_8eso']"));
  courses.click();
   Thread.sleep(2000);
  //action class 
 
  w.switchTo().window("http://www.book.com");
  Actions actions =new Actions(w);
  
  
  actions.contextClick(courses).perform();
  Robot robot = new Robot();
  for (int i = 1; i <=6; i++) {
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	
	Thread.sleep(2000);
}
  robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
  
  
}}