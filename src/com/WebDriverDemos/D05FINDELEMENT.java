package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05FINDELEMENT {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
WebElement emailId=driver.findElement(By.name("email"));

emailId.sendKeys("abc@gmail.com");
WebElement password=driver.findElement(By.name("pass"));
password.sendKeys("abc123");
WebElement loginbtn=driver.findElement(By.name("login"));
loginbtn.click();
	}
	

}
