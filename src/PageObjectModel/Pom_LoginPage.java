package PageObjectModel;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class Pom_LoginPage {
	    private WebDriver driver;
	    private By usernameField = By.id("username");
	    private By passwordField = By.xpath("//*[@id=\"password\"]");
	    private By LoginButton = By.xpath("//*[@id=\"submit\"]");

	    public Pom_LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void setUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void setPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLoginButton() {
	        driver.findElement(LoginButton).click();
	}
	}