package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDownExample {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver",
			"\\C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver web = new ChromeDriver();
	web.manage().window().maximize();
	
	web.get("https://www.leafground.com/drag.xhtml;jsessionid=node0uvw9kz68804jdz7drm3722z7356571.node0");
	

	WebElement from = web.findElement(By.id("form:drag_content"));
	WebElement to = web.findElement(By.xpath("//p[@class='ui-widget-header']"));
	
	Actions actions = new Actions(web);
	
	//actions.clickAndHold(from).moveToElement(to).build().perform();
	
	actions.dragAndDrop(from, to).perform();
}
}
