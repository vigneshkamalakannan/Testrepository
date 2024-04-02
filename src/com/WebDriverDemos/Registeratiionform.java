package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Registeratiionform {
    private WebDriver driver;
    private String baseUrl = "https://qavbox.github.io/demo/signup/?uname=&datafile=&sgender=select&commit=Submit";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    @Test
    public void testRegistrationForm() {
        
        driver.findElement(By.name("uname")).sendKeys("testuser");
        driver.findElement(By.id("email")).sendKeys("testuser@example.com");
        driver.findElement(By.id("tel")).sendKeys("1234567788");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }
}
