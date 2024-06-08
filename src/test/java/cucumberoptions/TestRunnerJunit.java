package cucumberoptions;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import PageObjects.Base;
import configuration.FileReader;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepdefinition.StepDefinition;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepdefinition",tags="@tag", plugin = {"pretty","html:target/cucumber.html"})
public class TestRunnerJunit {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws Throwable {

		String browser = FileReader.get_Instance().get_InstanceCR().get_Browser();
		String url = FileReader.get_Instance().get_InstanceCR().get_Url();
		driver = Base.getBrowser(browser);
     	driver = Base.getUrl(url);

		driver = StepDefinition.driver;
	}
}