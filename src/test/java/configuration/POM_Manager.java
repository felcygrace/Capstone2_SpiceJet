package configuration;
import org.openqa.selenium.WebDriver;
import PageObjects.Base;
import PageObjects.BookingPage;
import PageObjects.Dashborad;
import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import PageObjects.SearchPage;
import PageObjects.HomePage;

public class POM_Manager extends Base{
	
		public WebDriver driver;

		private LoginPage loginpage;
		private HomePage homepage;
		private RegistrationPage registrationpage;
        private Dashborad dashboardpage;
        private BookingPage bookingpage;
		private SearchPage searchpage;

		public POM_Manager(WebDriver driver2) {
			this.driver = driver2;

		}

		public LoginPage get_Instance_Login() {
			loginpage = new LoginPage(driver);
			return loginpage;

		}

		public HomePage get_Instance_HomePage() {
			homepage = new HomePage(driver);
			return homepage;

		}

		public RegistrationPage get_Instance_RegisterPage() {
			registrationpage = new RegistrationPage(driver);
			return registrationpage;

		}
		public Dashborad get_Instance_DasbordPage() {
			dashboardpage = new Dashborad(driver);
			return dashboardpage;

		}

		public SearchPage get_Instance_SP() {
			searchpage = new SearchPage(driver);
			return searchpage;
		}

		public BookingPage get_Instance_BP() {
			bookingpage = new BookingPage(driver);
			return bookingpage;
		}

	}

