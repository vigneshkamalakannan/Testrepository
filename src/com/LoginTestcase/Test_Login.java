package com.LoginTestcase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.Pom_LoginPage;
public class Test_Login  {
    private WebDriver driver;
    private Pom_LoginPage loginPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage = new Pom_LoginPage(driver);
    }

    @Test
    public void testLogin() {
        loginPage.setUsername("student");
        loginPage.setPassword("Password123");
        loginPage.clickLoginButton();
        
    }
}
