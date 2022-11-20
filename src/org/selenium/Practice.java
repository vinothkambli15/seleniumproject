package org.selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");



		WebDriver w = new ChromeDriver();
		w.get("https://datatables.net/examples/advanced_init/dt_events.html");
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		int row = w.findElements(By.xpath("//tbody/tr")).size();
        int colum =w.findElements(By.xpath("//tr/td")).size();

		do {
			List<WebElement> allname = w.findElements(By.xpath("//td[@class='sorting_1']//following::td[1]"));
			for (WebElement allnames : allname) {
			System.out.println(allnames.getText());
			}
			WebElement clic = w.findElement(By.id("example_next"));
			String attribute = clic.getAttribute("class");
			if(!attribute.contains("disabled")){
				clic.click();
			}else  
			break;
			
			
		}
		while(true);


	}
}