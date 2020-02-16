package com.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SmokeTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/taslimasweety/downloads/chromedriver");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.google.com/");
		String actualURL = dr.getCurrentUrl();
		System.out.println("actualURL is : "+actualURL);
		String actualTitle = dr.getTitle();
		System.out.println("actual Title is : "+actualTitle);
		Thread.sleep(3000);
		
		dr.quit();
		
	}
	
	
	
	
	
	
	
	}

	


