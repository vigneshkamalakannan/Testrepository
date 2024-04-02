package com.WebDriverDemos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class D02ReadTitle {

	public static void main(String[] args) {
		String expTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",actTitle;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 actTitle = driver.getTitle();
		System.out.println("title is:"+actTitle);
		if(expTitle .equals(actTitle))
		{
			System.out.println("its matching & test case-pass");
		}
		else {
			System.out.println("its not matching & test case-fail");
		}
		driver.close();
			}
	
	}
