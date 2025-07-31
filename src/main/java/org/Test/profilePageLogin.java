package org.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class profilePageLogin implements profilePageLoginActions {

    WebDriver driver;

    By firstNameInput = By.id("firstName");
    By lastNameInput = By.id("lastName");
    By userNameInput = By.id("userName");
    By passwordInput = By.id("password");
    By clickIamNotARobotButtonInput = By.id("recaptcha-anchor");
    By clickRegisterButtonInput = By.id("register");

    public profilePageLogin(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void clickNewUserButton() {
        driver.findElement(By.id("newUser")).click();
    }

    @Override
    public void firstName(String firstName) {
        driver.findElement(By.id("firstname")).sendKeys(firstName);
    }

    @Override
    public void lastName(String lastName) {
        driver.findElement(By.id("lastname")).sendKeys(lastName);
    }

    @Override
    public void userName(String userName) {
        driver.findElement(By.id("userName")).sendKeys(userName);
    }

    @Override
    public void password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Override
    public void clickIamNotARobotButton() {
        driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
    }

    @Override
    public void clickRegisterButton() {
        driver.findElement(By.id("register")).click();
    }

    @Override
    public void registerAs(String firstName, String lastName, String userName, String password) {
        firstName(firstName);
        lastName(lastName);
        userName(userName);
        password(password);
        clickIamNotARobotButton();
        clickRegisterButton();
    }
}
