package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableEx {
public static void main(String[] args) throws Exception {
	
      System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://demo.automationtesting.in/Selectable.html");

     
     driver.manage().window().maximize();
    
     Thread.sleep(3000);
     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
     
    List<WebElement> selectable = driver.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
    
    System.out.println(selectable.size());
    
    
    
    Actions actions = new Actions(driver); 
    actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).perform();
}
}
