package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Dashborad extends Base {
	public Dashborad(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement userAccountNameAfterSignUp() {
		WebElement userAccountNameAfter_SignUp = driver.findElement(By.className("d-none d-lg-block hello"));
		return userAccountNameAfter_SignUp;
	}
}
