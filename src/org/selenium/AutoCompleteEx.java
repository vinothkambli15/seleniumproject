package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteEx {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver w = new ChromeDriver();
	w.get("https://www.google.com/search?q=g&rlz=1C1RXQR_enIN1016IN1016&oq=g&aqs=chrome..69i57.1204j0j7&sourceid=chrome&ie=UTF-8");
	
	w.manage().window().maximize();
	WebElement findElement = w.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	
	findElement.sendKeys("selenium");

	List<WebElement> findElements = w.findElements(By.xpath("//ul[@class='erkvQe']"));
	
	for (WebElement webElement : findElements) {
		String text = webElement.getText();
		System.out.println(text);
	}	
}
}
