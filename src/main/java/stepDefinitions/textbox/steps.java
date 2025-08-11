package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.Test.Implemetations.TextBox;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class steps {

    private WebDriver driver;
    TextBox t;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        t = new TextBox(driver);  // Initialize after driver setup
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I access the page for Text Box")
    public void i_access_the_page_for_text_box() {
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter the details for the required fields")
    public void i_enter_the_details_for_the_required_fields() {
        throw new io.cucumber.java.PendingException();
    }

    @And("I click on submit")
    public void i_click_on_submit() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should get the details I given in a box")
    public void i_should_get_the_details_i_given_in_a_box() {
        throw new io.cucumber.java.PendingException();
    }
}
