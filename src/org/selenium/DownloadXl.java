package org.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadXl {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver w = new ChromeDriver();
	w.get("https://leafground.com/file.xhtml;jsessionid=node01ijcrs1ugxn07yi05jsaysvbm357718.node0");
	
	w.manage().window().maximize();
	
	WebElement findElement = w.findElement(By.xpath("//span[text()='Download']"));
	findElement.click();
	Thread.sleep(3000);
	File filelocation = new File("C:\\Users\\vinoth\\Downloads");
	File[] listFiles = filelocation.listFiles();
	
	for (File file : listFiles) {
		if (file.getName().equals("form 10c")) {
			System.out.println("file downloaded");
		}
	}
	
	
}
}
