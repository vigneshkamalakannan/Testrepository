package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssignment {
	WebDriver driver;
  @Test
  public void testcaseLogin() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @AfterMethod
  public void login() {
	  driver.findElement(By.xpath("//i[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	  driver.findElement(By.partialLinkText("log")).click();
  }
  @BeforeTest
  public void beforetest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
}