package execution;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	HomePage home=new HomePage(DriverFactory.getDriver());
	@Given("User is at homepage")
	public void user_is_at_homepage() {
		
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		
	}

	@When("User hover on women module")
	public void user_hover_on_women_module() throws InterruptedException {
		home.validateWomen();
	}

	@When("User hover on top")
	public void user_hover_on_top() {
		home.validateTops();
	}

	@When("User clicks on jacket")
	public void user_clicks_on_jacket() {
		home.validateJackets();
	}

	@Then("User should able to navigate to next")
	public void user_should_able_to_navigate_to_next() {
		System.out.println("hello");
	}


}
