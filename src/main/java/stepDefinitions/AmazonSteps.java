package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;

public class AmazonSteps {

    WebDriver driver;

    @Given("I launch the amazon website")
    public void i_launch_the_amazon_website() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
    }

    @When("I select the Books link")
    public void i_select_the_books_link() {
        driver.findElement(By.linkText("Books")).click();
    }

    @When("I select the children's Book")
    public void i_select_the_children_s_book() {
        driver.findElement(By.linkText("Children's Books")).click();
    }

    @When("I select the Book by the Book's name {string}")
    public void i_select_the_book_by_the_book_s_name(String bookName) {
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(bookName);
    }
    @And("I click on search button")
    public void iClickOnSearchButton() throws InterruptedException {
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(5000);
    }

    @And("I click on the Book {string}")
    public void iClickOnTheBook(String bookName) {

         driver.findElement(By.xpath("//img[@class='s-image']")).click();
//        String firstBookText = firstBook.getText();
//        if (firstBookText.contains(bookName)) {
//            firstBook.click();
//            System.out.println("Clicked on the book: " + bookName);
//        } else {
//            System.out.println("Sorry, the first book does not match " + bookName);
//        }
    }

    @And("I select the required quantity {int}")
    public void i_select_the_required_quantity(String quantity) {
       WebElement qtyDropdown = driver.findElement(By.id("quantity"));
        qtyDropdown.sendKeys(quantity);
        System.out.println(quantity);

    }

    @When("I click on Add to cart button")
    public void i_click_on_add_to_cart_button() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }

    @When("I click on proceed to buy item button")
    public void i_click_on_proceed_to_buy_item_button() {
        driver.findElement(By.name("proceedToRetailCheckout")).click();
    }

    @When("I enter mobile number {string} in enter mobile number or email field")
    public void i_enter_mobile_number_in_enter_mobile_number_or_email_field(String mobileNumber) {
        driver.findElement(By.id("ap_email")).sendKeys(mobileNumber);
    }

    @When("I click on continue")
    public void i_click_on_continue() {
        driver.findElement(By.id("continue")).click();
    }

    @When("I enter the password {string}")
    public void i_enter_the_password(String password) {
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Then("I enter into secure checkout page")
    public void i_enter_into_secure_checkout_page() {
        // Assertion to check if user is in checkout page
        boolean checkoutPage = driver.getCurrentUrl().contains("checkout");
        if (checkoutPage) {
            System.out.println("Successfully navigated to secure checkout page.");
        } else {
            System.out.println("Navigation to checkout page failed.");
        }
        driver.quit();
    }


    @And("I verify that <quantity> I need and the <quantity> got selected is same")
    public void iVerifyThatQuantityINeedAndTheQuantityGotSelectedIsSame() {
    }
}
