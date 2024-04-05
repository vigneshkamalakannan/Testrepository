package devops;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import java.net.MalformedURLException;
import java.net.URL;

public class NewTest {
	public WebDriver driver;
  @Test
	  public void  browserTest(String bname) throws MalformedURLException,InterruptedException  {
if(bname.equalsIgnoreCase("chrome")) {
	    	ChromeOptions options=new ChromeOptions();
	    	Reporter.log("Test executing on chrome!",true);
	    	driver= new RemoteWebDriver (new URL("http://localhost:4444"),options);
	    	Reporter.log("Driver Session established with Server!",true);
}
else if(bname.equalsIgnoreCase("edge")) {
	EdgeOptions options=new EdgeOptions();
	Reporter.log("Test executing on chrome!",true);
	driver= new RemoteWebDriver (new URL("http://localhost:4444"),options);
	Reporter.log("Driver Session established with Server!",true);
}
else if(bname.equalsIgnoreCase("firefox")) {
	FirefoxOptions options=new FirefoxOptions();
	Reporter.log("Test executing on chrome!",true);
	driver= new RemoteWebDriver (new URL("http://localhost:4444"),options);
	Reporter.log("Driver Session established with Server!",true);
}    
Thread.sleep(5000);
	    	driver.get("https://www.amazon.in");
	    	System.out.println("the title is :"+driver.getTitle());  
	    	Thread.sleep(10000);
	    	Reporter.log("Test executing for amazon applications!",true);
	    	driver.quit();
  }
}
