package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbusdemo {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.redbus.in");
driver.manage().window().maximize();
WebElement src = driver.findElement(By.id("src"));
src.sendKeys("chennai");
driver.findElement(By.id("dest")).sendKeys("madurai");
driver.findElement(By.xpath("//div[@class='fl "
		+ "search-box date-box gtm-onwardCalendar']")).click();
driver.findElement(By.xpath("//td[@class='current day']")).click();

}
}
