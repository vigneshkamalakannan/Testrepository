package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DO4READPAGESOURCE {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	String PageSource = driver.getPageSource();
	System.out.println("PageSource:"+PageSource);
	driver.close();
	

	}

}
