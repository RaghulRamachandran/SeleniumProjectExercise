package org.Test.Implementations;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.time.Duration;

public class PracticeFormImplementations {

    private WebDriver driver;
    private WebDriverWait wait;

    public PracticeFormImplementations(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void Url() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    public void FirstName(String fname) {
        driver.findElement(By.id("firstName")).sendKeys(fname);
    }

    public void LastName(String lname) {
        driver.findElement(By.id("lastName")).sendKeys(lname);
    }

    public void Email(String email) {
        driver.findElement(By.id("userEmail")).sendKeys(email);
    }

    public void Gender(String gender) {
        String genderXpath = "//label[text()='" + gender + "']";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(genderXpath))).click();
    }

    public void Mobile(String mobile) {
        driver.findElement(By.id("userNumber")).sendKeys(mobile);
    }

    public void DOB(String day, String month, String year) {
        driver.findElement(By.id("dateOfBirthInput")).click();

        Select monthSelect = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        monthSelect.selectByVisibleText(month);

        Select yearSelect = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        yearSelect.selectByVisibleText(year);

        String dayFormatted = String.valueOf(Integer.parseInt(day)); // removes leading zero if present
        String dayXpath = "//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month')) and text()='" + dayFormatted + "']";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dayXpath))).click();
    }



    public void Subjects(String subject) {
        WebElement subjectInput = driver.findElement(By.id("subjectsInput"));
        subjectInput.sendKeys(subject);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".subjects-auto-complete__menu")));

        By optionLocator = By.xpath("//div[contains(@class,'subjects-auto-complete__option') and normalize-space(text())='" + subject + "']");
        wait.until(ExpectedConditions.presenceOfElementLocated(optionLocator));

        try {
            wait.until(ExpectedConditions.elementToBeClickable(optionLocator));
            driver.findElement(optionLocator).click();
        } catch (ElementClickInterceptedException e) {
            WebElement option = driver.findElement(optionLocator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);
        }
    }

    public void Hobbies(String hobby) {
        String hobbyXpath = "//label[text()='" + hobby + "']";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(hobbyXpath))).click();
    }

    public void picture(String filePath) {
        filePath = filePath.replace("\"", "").trim();
        File file = new File(filePath);
        if (!file.isAbsolute()) {
            file = new File(System.getProperty("user.dir") + File.separator + filePath);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement uploadElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("uploadPicture"))
        );
        uploadElement.sendKeys(file.getAbsolutePath());
    }


    public void CurrentAddress(String address) {
        driver.findElement(By.id("currentAddress")).sendKeys(address);
    }

    public void State(String state) {
        WebElement stateField = driver.findElement(By.id("react-select-3-input"));
        stateField.sendKeys(state);
        stateField.sendKeys(Keys.ENTER);
    }

    public void city(String city) {
        WebElement cityField = driver.findElement(By.id("react-select-4-input"));
        cityField.sendKeys(city);
        cityField.sendKeys(Keys.ENTER);
    }

    public void clicksubmitbutton() {
        driver.findElement(By.id("submit")).click();
    }


}
