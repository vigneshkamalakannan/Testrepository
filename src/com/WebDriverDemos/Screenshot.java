package com.WebDriverDemos;
	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.google.common.io.Files;

	public class Screenshot {

		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://bstackdemo.com/");
			driver.manage().window().maximize();
			File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f, new File("C:\\New folder\\snaps\\bstackdemo.jpg"));
		}

	}
