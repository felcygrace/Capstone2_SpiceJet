package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver driver = new ChromeDriver();
	
	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath ="//div[contains(@class, 'css-76zvg2') and text()='Login']")
	WebElement LoginButton;
	
	@FindBy(xpath ="//div[@class='css-76zvg2 r-cqee49 r-ubezar r-majxgm r-1ifxtd0 r-kc8jnq']")
	WebElement LoginInfo;
	
	@FindBy(xpath ="//div[text(),'Email')]")
	WebElement emailbutton;
	
	
	public void launchbrowser() {
		// Set the system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\FELCY\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Open spicejet website
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();  
	}
	
	public void clickLoginButton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginButton.click();	
	}

	public void verifyLoginPage() {
		System.out.print(LoginInfo);
		
	}
	 
       

}
