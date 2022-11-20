package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {
public static void main(String[] args) {
	//configure Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	//launch the browser
	//interface               //class
	WebDriver driver = new ChromeDriver();
	//get launching the url
	driver.get("https://www.flipkart.com//");
	
	driver.get("https://www.amazon.com/");
//maximizing window
	driver.manage().window().maximize();
	//verify title
	String title = driver.getTitle();
	System.out.println(title);
	
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	boolean equals = driver.equals(title);
	System.out.println(equals);


	
	//quite
	driver.quit();
}
}
