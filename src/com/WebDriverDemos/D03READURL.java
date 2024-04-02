package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03READURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
String Url=driver.getCurrentUrl();
System.out.println("Url :"+Url);
driver.close();
	}

}
