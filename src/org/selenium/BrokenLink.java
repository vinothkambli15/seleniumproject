package org.selenium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com");

		List<WebElement> list = w.findElements(By.tagName("a"));
		list.size();
		System.out.println(list.size());
		for (WebElement webElement : list) {
			
			String at = webElement.getAttribute("href");
			
		}
		

//			if (at != null) {
//				URL u = new URL(at);
//				URLConnection openConnection = u.openConnection();
//				HttpsURLConnection hp = (HttpsURLConnection) openConnection;
//				int code = hp.getResponseCode();
//				if (code >= 400) {
//					System.out.println(at);
//				}

			}

		

	}
