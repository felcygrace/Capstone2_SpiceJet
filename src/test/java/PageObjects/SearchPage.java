package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class SearchPage extends Base {
	public SearchPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement availableFlightForSearchResult() {
		WebElement availableFlightForSearch_Result = driver.findElement(By.xpath("//div[text()='Departs']"));
		return availableFlightForSearch_Result;
	}

	public WebElement selectFlight() {
		WebElement select_Flight = driver
				.findElement(By.xpath("//*[@id=\"list-results-section-0\"]/div[5]/div/div/div[2]/div[1]/div/div/div"));
		return select_Flight;
	}

	public WebElement cotinueButton() {
		WebElement cotinue_Button = driver.findElement(By.xpath("(//div[text()='Continue'])[1]"));
		return cotinue_Button;
	}
}