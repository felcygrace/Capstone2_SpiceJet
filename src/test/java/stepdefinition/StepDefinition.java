package stepdefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageObjects.Base;
import configuration.POM_Manager;
import cucumberoptions.TestRunnerJunit;
import io.cucumber.java.en.*;


public class StepDefinition extends Base {

	public static WebDriver driver = TestRunnerJunit.driver;

	POM_Manager pom = new POM_Manager(driver);

	// Sign up Functionality

	@Given("User is on the Home Page")
	public void launch_the_url() {
		System.out.println("An URL has been launched");
	}

	@When("User click the sign up menu")
	public void user_click_the_sign_up_menu() {

		clickOnElement(pom.get_Instance_HomePage().signUpMenu());
		System.out.println("clicked the sign up");
		windowHandles();

	}

	@And("User select the title option (.*)$")
	public void user_select_the_title_option(String value) {
		selection(pom.get_Instance_RegisterPage().titleSelection(), "byVisibleText", value);

	}

	@And("User enter the firstname (.*)$")
	public void user_enter_the_firstname(String firstName) {
		inputValueElement(pom.get_Instance_RegisterPage().firstNameForSignUp(), firstName);

	}

	@And("User enter the lastname (.*)$")
	public void user_enter_the_lastname(String lastName) {
		inputValueElement(pom.get_Instance_RegisterPage().lastNameForSignUp(), lastName);
	}

	@And("User select the country (.*)$")
	public void user_select_the_country(String country) {
		selection(pom.get_Instance_RegisterPage().countrySelection(), "byVisibleText", country);

	}

	@And("User select the date of birth (.*)$")
	public void user_select_the_date_of_birth(String dob) {
		inputValueElement(pom.get_Instance_RegisterPage().dateSelection(), dob);
	}

	@And("User enter the mobile number (.*)$")
	public void user_enter_the_mobile_number(String mobileNumber) {
		inputValueElement(pom.get_Instance_RegisterPage().mobileNumber(), mobileNumber);
	}

	@And("User enter the email id (.*)$")
	public void user_enter_the_email_id(String mailId) {
		inputValueElement(pom.get_Instance_RegisterPage().emailId(), mailId);
	}

	@And("User enter the password (.*)$")
	public void user_enter_the_password(String password) {
		inputValueElement(pom.get_Instance_RegisterPage().password(), password);
	}

	@And("User enter the confirm password (.*)$")
	public void user_enter_the_confirm_password(String confirmPassword) {
		inputValueElement(pom.get_Instance_RegisterPage().confirmPasswaord(), confirmPassword);
	}

	@And("User click the agree")
	public void user_click_the_agree() {
		clickOnElement(pom.get_Instance_RegisterPage().iAgreeForSignUp());
	}

	@And("User click the submit")
	public void user_click_the_submit() {
		clickOnElement(pom.get_Instance_RegisterPage().submitForSignUp());
	}

	@Then("Validate the sign up successfully or not (.*)$")
	public void validate_the_sign_up_successfully_or_not(String firstName) throws IOException {
		WebElement accountName = pom.get_Instance_HomePage().userAccountNameForLogin();
		String nameAccount = accountName.getText();
		String actualElement = nameAccount;
		String expectedElement = "Hi " + firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User account create successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User account create not successful...? ");
		}

	}

	// Login to SpiceJet Website

	// User successfully logs in with valid credentials

	@Given("First user is on the SpiceJet login page")
	public void first_user_is_on_the_spice_jet_login_page() {
		System.out.println("Arrived at the login page.");
	}

	@When("First user enters valid userid (.*)$")
	public void first_user_enters_valid_userid(String validUserId) {
		inputValueElement(pom.get_Instance_HomePage().mobileNumberForLogin(), validUserId);
	}

	@When("First user enter valid password (.*)$")
	public void first_user_enter_valid_password(String validPassword) {
		inputValueElement(pom.get_Instance_HomePage().passwordForLogin(), validPassword);
	}

	@When("First user clicks on the login button")
	public void first_user_clicks_on_the_login_button() {
		clickOnElement(pom.get_Instance_HomePage().loginButton());
	}

	@Then("First user validate the login successfully or not (.*)$")
	public void first_user_validate_the_login_successfully_or_not(String firstName) {
		WebElement accountName = pom.get_Instance_HomePage().userAccountNameForLogin();
		String nameAccount = accountName.getText();
		String actualElement = nameAccount;
		String expectedElement = "Hi " + firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User account login successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User account login not successful...? ");
		}
	}

	// User logs in with invalid credentials

	@Given("second user is on the SpiceJet login page")
	public void second_user_is_on_the_spice_jet_login_page() {
		System.out.println("Arrived at the login page.");
	}

	@When("second user enters invalid userid (.*)$")
	public void second_user_enters_invalid_userid(String invalidUserId) {
		inputValueElement(pom.get_Instance_HomePage().mobileNumberForLogin(), invalidUserId);
	}

	@When("second user enter valid password (.*)$")
	public void second_user_enter_valid_password(String validPassword) {
		inputValueElement(pom.get_Instance_HomePage().passwordForLogin(), validPassword);
	}

	@When("second user clicks on the login button")
	public void second_user_clicks_on_the_login_button() {
		clickOnElement(pom.get_Instance_HomePage().loginButton());
	}

	@Then("second user validate the login successfully or not (.*)$")
	public void second_user_validate_the_login_successfully_or_not(String firstName) {
		WebElement accountName = pom.get_Instance_HomePage().userAccountNameForLogin();
		String nameAccount = accountName.getText();
		String actualElement = nameAccount;
		String expectedElement = "Hi " + firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User account login successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User account login not successful...? ");
		}
	}

	// logs in with invalid credentials

	@Given("Third user is on the SpiceJet login page")
	public void third_user_is_on_the_spice_jet_login_page() {
		System.out.println("Arrived at the login page.");
	}

	@When("Third user enters valid userid (.*)$")
	public void third_user_enters_valid_userid(String validUserId) {
		inputValueElement(pom.get_Instance_HomePage().mobileNumberForLogin(), validUserId);
	}

	@When("Third user enter invalid password (.*)$")
	public void third_user_enter_invalid_password(String invalidPassword) {
		inputValueElement(pom.get_Instance_HomePage().passwordForLogin(), invalidPassword);
	}

	@When("Third user clicks on the login button")
	public void third_user_clicks_on_the_login_button() {
		clickOnElement(pom.get_Instance_HomePage().loginButton());
	}

	@Then("Third user validate the login successfully or not (.*)$")
	public void third_user_validate_the_login_successfully_or_not(String firstName) {
		WebElement accountName = pom.get_Instance_HomePage().userAccountNameForLogin();
		String nameAccount = accountName.getText();
		String actualElement = nameAccount;
		String expectedElement = "Hi " + firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User account login successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User account login not successful...? ");
		}
	}

	// Book One-Way Trip on SpiceJet Website

	@Given("User_i is on the Home Page")
	public void i_am_on_the_spice_jet_website_homepage() {
		System.out.println("Arrived at the login page.");
	}

	@When("User select the oneway trip option")
	public void i_select_the_oneway_trip_option() {
		clickOnElement(pom.get_Instance_HomePage().oneWayRadioButton());
	}

	@And("^User enter the departure city as \"([^\"]*)\" and destination city as \"([^\"]*)\"$")
	public void i_enter_the_departure_city_as_and_destination_city_as(String DepartureCity, String DestinationCity) {
		inputValueElement(pom.get_Instance_HomePage().fromsearchdestination(), DepartureCity);
		explicitVidibilityOfWait(pom.get_Instance_HomePage().tosearchdestination(), 10);
		inputValueElement(pom.get_Instance_HomePage().tosearchdestination(), DestinationCity);
	}

	@And("^User select the departure date as \"([^\"]*)\"$")
	public void i_select_the_departure_date_as(String DepartureDate) {
		inputValueElement(pom.get_Instance_HomePage().departureDate(), DepartureDate);
	}

	@And("User select the passengers")
	public void i_select_the_passengers() {
		clickOnElement(pom.get_Instance_HomePage().passengersCount());
		clickOnElement(pom.get_Instance_HomePage().addPassengers());
	}

	@And("User select the currency")
	public void i_select_the_currency() {
		System.out.println("selected the currency");
	}

	@And("User click on the search flights button")
	public void i_click_on_the_search_flights_button() {
		clickOnElement(pom.get_Instance_HomePage().searchFlight());

	}

	@Then("User should see a list of available flights for the specified route and date")
	public void i_should_see_a_list_of_available_flights_for_the_specified_route_and_date() {
		WebElement availableFlight = pom.get_Instance_SP().availableFlightForSearchResult();

		if (availableFlight.equals("Departs")) {
			System.out.println("The available flight search results.");
		} else {
			System.out.println("The unavailable flight search results.");
		}
	}

//Book a Round Trip

	@Given("SecondUser on the SpiceJet website homepage for roundtrip")
	public void i_am_on_the_spice_jet_website_homepage_for_roundtrip() {

		System.out.println("Arrived at the home page.");
	}

	@When("SecondUser select the round trip option for roundtrip")
	public void i_select_the_round_trip_option_for_roundtrip() {
		clickOnElement(pom.get_Instance_HomePage().roundTripRadioButton());
	}

	@When("SecondUser enter the departure city for roundtrip \"([^\"]*)\"\"([^\"]*)\"$")
	public void i_enter_the_departure_city_for_roundtrip(String DepartureCity, String DestinationCity) {
		inputValueElement(pom.get_Instance_HomePage().fromsearchdestination(), DepartureCity);
		explicitVidibilityOfWait(pom.get_Instance_HomePage().tosearchdestination(), 10);
		inputValueElement(pom.get_Instance_HomePage().tosearchdestination(), DestinationCity);
	}

	@When("^SecondUser select the departure date for roundtrip \"([^\"]*)\"$")
	public void i_select_the_departure_date_for_roundtrip(String DepartureDate) {
		inputValueElement(pom.get_Instance_HomePage().departureDate(), DepartureDate);
	}

	@When("^SecondUser select the return date for roundtrip \"([^\"]*)\"$")
	public void i_select_the_return_date_for_roundtrip(String ReturnDate) {
		inputValueElement(pom.get_Instance_HomePage().returnDate(), ReturnDate);
	}

	@When("SecondUser select the passengers for roundtrip")
	public void i_select_the_passengers_for_roundtrip() {
		clickOnElement(pom.get_Instance_HomePage().passengersCount());
		clickOnElement(pom.get_Instance_HomePage().addPassengers());
	}

	@When("SecondUser select the currency for roundtrip")
	public void i_select_the_currency_for_roundtrip() {
		System.out.println("selected the currency");
	}

	@When("SecondUser click on the search flights button for roundtrip")
	public void i_click_on_the_search_flights_button_for_roundtrip() {
		clickOnElement(pom.get_Instance_HomePage().searchFlight());
	}

	@Then("SecondUser should see a list of available flights for the specified route and date for roundtrip")
	public void i_should_see_a_list_of_available_flights_for_the_specified_route_and_date_for_roundtrip() {
		WebElement availableFlight = pom.get_Instance_SP().availableFlightForSearchResult();

		if (availableFlight.equals("Departs")) {
			System.out.println("The available flight search results.");
		} else {
			System.out.println("The unavailable flight search results.");
		}
	}

	// Select and Proceed to Booking Page on SpiceJet Website

	@Given("I am on the SpiceJet website homepage for booking")
	public void i_am_on_the_spice_jet_website_homepage_for_booking() {
		System.out.println("Arrived at the home page.");

	}

	@When("^I search for flights from \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_search_for_flights_from(String DepartureCity, String DestinationCity, String DepartureDate) {
		clickOnElement(pom.get_Instance_HomePage().oneWayRadioButton());
		inputValueElement(pom.get_Instance_HomePage().fromsearchdestination(), DepartureCity);
		explicitVidibilityOfWait(pom.get_Instance_HomePage().tosearchdestination(), 10);
		inputValueElement(pom.get_Instance_HomePage().tosearchdestination(), DestinationCity);
		inputValueElement(pom.get_Instance_HomePage().departureDate(), DepartureDate);
		clickOnElement(pom.get_Instance_HomePage().passengersCount());
		clickOnElement(pom.get_Instance_HomePage().addPassengers());
		System.out.println("selected the currency");
		clickOnElement(pom.get_Instance_HomePage().searchFlight());
	}

	@When("I select a flight from the search results")
	public void i_select_a_flight_from_the_search_results() {
		clickOnElement(pom.get_Instance_SP().selectFlight());
		clickOnElement(pom.get_Instance_SP().cotinueButton());
	}

	@When("^I proceed to the booking page \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void i_proceed_to_the_booking_page(String title, String lastName, String mobileNumber, String firstName,
			String email, String city, String titleforpassenger, String lastNameforpassenger,
			String mobilenumberforpassenger, String cardnumber, String cardholdername, String cardmonth,
			String cardyear) {
		inputValueElement(pom.get_Instance_BP().titleSelection(), title);
		inputValueElement(pom.get_Instance_BP().firstNameForContact(), firstName);
		inputValueElement(pom.get_Instance_BP().lastNameForBooking(), lastName);
		inputValueElement(pom.get_Instance_BP().contactNumberForBooking(), mobileNumber);
		inputValueElement(pom.get_Instance_BP().emailForBooking(), email);
		inputValueElement(pom.get_Instance_BP().cityForBooking(), city);
		clickOnElement(pom.get_Instance_BP().iPreferForBooking());
		inputValueElement(pom.get_Instance_BP().titleSelectionForPassenger(), titleforpassenger);
		inputValueElement(pom.get_Instance_BP().lastNameForPassenger(), lastNameforpassenger);
		inputValueElement(pom.get_Instance_BP().mobileNumberForPassenger(), mobilenumberforpassenger);
		clickOnElement(pom.get_Instance_BP().continueButtonForBooking());
		clickOnElement(pom.get_Instance_BP().continueForSecond());
		inputValueElement(pom.get_Instance_BP().cardNumber(), cardnumber);
		inputValueElement(pom.get_Instance_BP().cardHolderName(), cardholdername);
		inputValueElement(pom.get_Instance_BP().cardExpiryMonth(), cardmonth);
		inputValueElement(pom.get_Instance_BP().cardExpiryYear(), cardyear);
		clickOnElement(pom.get_Instance_BP().proceedToPay());

	}

	@Then("I should be directed to the booking page to complete the reservation")
	public void i_should_be_directed_to_the_booking_page_to_complete_the_reservation() {
		WebElement paymentconfirmmsg = pom.get_Instance_SP().availableFlightForSearchResult();

		if (paymentconfirmmsg.equals("Payment Successful")) {
			System.out.println("Your Flight booked successfully");
		} else {
			System.out.println("Flight booking failed");
		}
	}

	// Validate Fields on Booking Page

	@Given("^I am on the booking page Check-in field \"([^\"]*)\" \"([^\"]*)\"$")
	public void iAmOnBookingPageCheckInField(String pnrNumber, String email) {
		System.out.println("Am on the check in filed page");
		inputValueElement(pom.get_Instance_HomePage().PNR_Number(), pnrNumber);
		inputValueElement(pom.get_Instance_HomePage().emailForCheckIn(), email);
	}

	@Then("I should see the Check-in field")
	public void iShouldSeeCheckInField() {
		WebElement checkinfiled = pom.get_Instance_HomePage().searchBookingButton();

		if (checkinfiled.equals("Search Booking")) {
			System.out.println("check in successfully");
		} else {
			System.out.println("check in failed");
		}
	}

	@Given("^I am on the booking page Flight Status field \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"$")
	public void iAmOnBookingPageFlightStatusField(String date, String from, String to) {
		System.out.println("Am on the flight status field page");
		inputValueElement(pom.get_Instance_HomePage().departureDateForFlightStatus(), date);
		inputValueElement(pom.get_Instance_HomePage().fromForFlightStatus(), from);
		inputValueElement(pom.get_Instance_HomePage().toForFlightStatus(), to);
		clickOnElement(pom.get_Instance_HomePage().searchFlightButtonForFlightStatus());
	}

	@Then("I should see the Flight Status field")
	public void iShouldSeeFlightStatusField() {
		WebElement flightstatus = pom.get_Instance_HomePage().flightStatus();

		if (flightstatus.equals("Flight Status:")) {
			System.out.println("user able to see flight status");
		} else {
			System.out.println("user not able to see flight status");
		}
	}

	@Given("^I am on the booking page Manage Booking field \"([^\"]*)\"\"([^\"]*)\"$")
	public void iAmOnBookingPageManageBookingField(String pnrNumber, String email) {
		System.out.println("Am on the manage booking filed page");
		inputValueElement(pom.get_Instance_HomePage().PNR_Number(), pnrNumber);
		inputValueElement(pom.get_Instance_HomePage().emailForCheckIn(), email);

	}

	@Then("I should see the Manage Booking field")
	public void iShouldSeeManageBookingField() {
		WebElement bookingfields = pom.get_Instance_HomePage().searchBookingButton();

		if (bookingfields.equals("Search Booking")) {
			System.out.println("user able to see manage booking field");
		} else {
			System.out.println("user not able to see manage booking field");
		}
	}
}