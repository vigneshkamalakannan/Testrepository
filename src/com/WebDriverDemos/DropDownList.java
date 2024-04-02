package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
        WebElement dropdown = driver.findElement(By.id("country"));
        Select countries = new Select(dropdown);
        System.out.println("selected country :"+countries.getFirstSelectedOption().getText());
        
        List<WebElement>countrylist = countries.getOptions();
        System.out.println("total countries:"+countrylist.size());
        
    /* int i=0;
        for(WebElement c : countrylist)
        {
       System.out.println(i+"."+c.getText());
       i++;
        }*/
        countries.selectByVisibleText("American Samoa");
     
       // countries.selectByValue("37");
        System.out.println("selected country :"+countries.getFirstSelectedOption().getText());
        
	}

}
