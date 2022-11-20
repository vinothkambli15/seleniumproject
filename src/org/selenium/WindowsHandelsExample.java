package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandelsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver web = new ChromeDriver();
	
	web.get("https://www.flipkart.com/wearable-smart-devices/smart-watches/pr?sid=ajy%2Cbuh&p%5B%5D=facets.brand%255B%255D%3DDIZO&otracker=clp_banner_1_6.bannerX3.BANNER_electronics-big-billion-days-store_I442ZXUHE7M8&fm=neo%2Fmerchandising&iid=M_d627805f-73bb-4020-b9c0-6b424305e7b8_6.I442ZXUHE7M8&ppt=hp&ppn=homepage&ssid=hv82tnifsg0000001664530796230");
	web.manage().window().maximize();
	
	web.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	
	String pw = web.getWindowHandle();
	
	web.switchTo().window(pw);
	Thread.sleep(10000);
	
	System.out.println(web.getWindowHandles().size());
	Set<String> childwindow = web.getWindowHandles();
	
	for (String allwindwindow : childwindow) {
		if (pw!=allwindwindow) {
			web.switchTo().window(allwindwindow);
			
		}
web.close();
	}
	
	}
}
