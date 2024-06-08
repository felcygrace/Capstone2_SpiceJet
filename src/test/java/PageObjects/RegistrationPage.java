package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import PageObjects.Base;

public class RegistrationPage extends Base{

	public RegistrationPage(WebDriver driver1) {
		this.driver = driver1;
		
		PageFactory.initElements(driver1, this);
	}
	
	@FindBy(xpath ="(//select[contains(@class,'form-control form-select')])[1]")
	WebElement title;
	
	@FindBy(id = "first_name")
	WebElement firstname;
	
	
	@FindBy(id = "last_name")
	WebElement lastname;
	
	@FindBy(xpath = "//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(id ="dobDate")
	WebElement dateofbirth;
	
	@FindBy(xpath = "//input[@placeholder='+91 01234 56789']")
	WebElement phonenumber;
	
	@FindBy(id = "email_id")
	WebElement email_id;
	
	@FindBy(id = "new-password")
	WebElement new_password;
	
	@FindBy(id = "c-password")
	WebElement confirmpassword;
	
	@FindBy(id ="defaultCheck1")
	WebElement checkbox;
	
	@FindBy(xpath= "//button[text()='Submit']")
	WebElement submitbutton;
	
	public WebElement titleSelection() {
		return title;
	}

	public WebElement firstNameForSignUp() {
		return firstname;
	}

	public WebElement lastNameForSignUp() {
		return lastname;
	}

	public WebElement countrySelection() {
		return country;
	}

	public WebElement dateSelection() {
		return dateofbirth;
	}

	public WebElement mobileNumber() {
		return phonenumber;
	}

	public WebElement emailId() {
		return email_id;
	}

	public WebElement password() {
		return new_password;
	}

	public WebElement confirmPasswaord() {
		return confirmpassword;
	}

	public WebElement iAgreeForSignUp() {
		return checkbox;
	}

	public WebElement submitForSignUp() {
		return submitbutton;
	}
}
