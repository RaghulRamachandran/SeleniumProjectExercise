package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Test.Implemetations.demoLoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demoQALoginPagesteps {
    private final String LOGIN_URL = "https://demoqa.com/login";
    private final String UNAME = "Rchandran";
    private final String PWD = "Ramachandran@123";
    private WebDriver driver;
    private demoLoginPage loginPage;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        loginPage = new demoLoginPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Given("I access the Demo QA login Page")
    public void i_access_the_demo_qa_login_page() throws InterruptedException {
        driver.get(LOGIN_URL);
        Thread.sleep(4000);
    }

    @When("I enter a UserName and password")
    public void i_enter_a_user_name_and_password() throws InterruptedException {
        loginPage.loginAs(UNAME, PWD);
        Thread.sleep(4000);
    }

    @And("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(4000);
    }

    @Then("I should be able to login successfully")
    public void i_should_be_able_to_login_successfully() {

    }

    @And("I verify that the text contains the expecteduserName {string}")
    public void iVerifyThatTheTextContainsTheExpecteduserName(String text) {
        text = driver.findElement(By.xpath("//label[@id='userName-value']")).getText();
        Assert.assertEquals(UNAME, text);
    }
}
