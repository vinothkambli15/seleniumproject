package org.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class DropDown {
public static void main(String[] args) throws InterruptedException  {
	
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	

	driver.get("https://testleaf.herokuapp.com/pages/Window.html");
	WebElement click = driver.findElement(By.id("home"));
	click.click();
	
	driver.quit();

	
	
	
	}
	}
