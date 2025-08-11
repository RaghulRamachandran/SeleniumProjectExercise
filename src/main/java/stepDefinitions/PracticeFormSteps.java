package stepDefinitions;

import io.cucumber.java.en.*;
import org.Test.Implementations.PracticeFormImplementations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeFormSteps {

    WebDriver driver;
    PracticeFormImplementations form;

    @Given("I open the practice form")
    public void i_open_the_practice_form() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        form = new PracticeFormImplementations(driver);
        form.Url();
    }

    @When("I enter first name {string}")
    public void i_enter_first_name(String firstName) {
        form.FirstName(firstName);
    }

    @And("I enter last name {string}")
    public void i_enter_last_name(String lastName) {
        form.LastName(lastName);
    }

    @And("I enter email {string}")
    public void i_enter_email(String email) {
        form.Email(email);
    }

    @And("I select gender {string}")
    public void i_select_gender(String gender) {
        form.Gender(gender);
    }

    @And("I enter mobile number {string}")
    public void i_enter_mobile_number(String mobile) {
        form.Mobile(mobile);
    }

    @And("I select date of birth {string} {string} {string}")
    public void i_select_date_of_birth(String day, String month, String year) {
        form.DOB(day, month, year);
    }


    @And("I enter subjects {string}")
    public void i_enter_subjects(String subjects) {
        form.Subjects(subjects);
    }

    @And("I select hobbies {string}")
    public void i_select_hobbies(String hobbies) {
        form.Hobbies(hobbies);
    }

    @And("I upload picture {string}")
    public void i_Upload_Picture(String picture) {
        form.picture(picture);
    }

    @And("I enter current address {string}")
    public void i_enter_current_address(String address) {
        form.CurrentAddress(address);
    }

    @And("I select state {string}")
    public void i_select_state(String state) {
        form.State(state);
    }

    @And("I select city {string}")
    public void i_select_city(String city) {
        form.city(city);
    }

    @Then("I click the submit button")
    public void i_submit_the_form() {
        form.clicksubmitbutton();
        driver.quit();
    }


}
