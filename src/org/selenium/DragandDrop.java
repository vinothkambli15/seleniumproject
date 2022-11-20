package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver w = new ChromeDriver();
	
	w.get("http://greenstech.in/selenium-course-content.html");
  WebElement courses = w.findElement(By.xpath("//div[@title='Courses']"));
  
  //Actions class
  Actions actions=new Actions(w);
  //to move to particular element
  actions.moveToElement(courses).perform();
  
  w.get("http://www.Facebook.com//");
    WebElement imgFb = w.findElement(By.xpath("//img[@alt='facebook']"));
    
    //actions class
    Actions actions1 = new Actions(w);
    
    actions.contextClick(imgFb).perform();
    
    //robot class keyboardaction
    //add throws decalaration
    
    Robot robot = new Robot();
    for (int i = 0; i <=7; i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
	}
    
    robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN); 
  
}
}
