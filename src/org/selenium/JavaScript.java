package org.selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class JavaScript {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver w = new ChromeDriver();

		w.navigate().to("http://testleaf.herokuapp.com/pages/table.html");
		w.manage().window().maximize();
		List<WebElement> findElements = w.findElements(By.tagName("th"));
		int size = findElements.size();
		System.out.println(size);
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		List<WebElement> list = w.findElements(By.tagName("td"));
		for (int i = 0; i < list.size(); i++) {
			WebElement webElement = list.get(i);
			System.out.println(webElement.getText());
		}
		System.out.println("foreach");
		for (WebElement webElement : list) {
			String text = webElement.getText();
			System.out.println(text);
		}
		List<WebElement> findElements2 = w.findElements(By.tagName("tr"));
		System.out.println("forloop");
		for (int i = 0; i < findElements2.size(); i++) {
			WebElement element = findElements2.get(i);
			System.out.println(element);
		}
		System.out.println("foreach 2"); 
		for (WebElement webElement : findElements2) {
			String text2 = webElement.getText();
			System.out.println(text2);
		}

		w.close();
	}
}
