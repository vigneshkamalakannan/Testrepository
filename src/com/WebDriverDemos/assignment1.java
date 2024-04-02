package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class assignment1 {
	public static void main(String[] args) {

			// Set up the WebDriver (in this case, for Chrome)
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			// Navigate to the website
			driver.get("https://www.google.co.in/");
			    // Wait for the specific link to be clickable
			WebElement    link = driver.findElement(By.xpath( "//*[@id=\"APjFqb\"]"));
                link.click();

			    //You can add further actions after clicking the link if needed
			    driver.close();
	}
}