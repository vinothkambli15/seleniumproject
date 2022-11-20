package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipEx {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"\\C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver web = new ChromeDriver();
	web.manage().window().maximize();
	web.get("https://www.leafground.com/input.xhtml;jsessionid=node0uvw9kz68804jdz7drm3722z7356571.node0");
	
	WebElement tool = web.findElement(By.id("j_idt88:name"));
	
	String attribute = tool.getAttribute("placeholder");
	System.out.println(attribute);
	
	web.quit();
}
}
