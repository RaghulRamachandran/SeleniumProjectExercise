package org.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demoLoginPage implements demoQaLoginPageActions {

    WebDriver driver;

    By usernameInput = By.id("userName");
    By passwordInput = By.id("password");
    By loginButton = By.id("login");

    public demoLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void userName(String userName) {
        driver.findElement(usernameInput).sendKeys(userName);
    }

    @Override
    public void password(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    @Override
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    @Override
    public void loginAs(String userName, String password) {
        userName(userName);
        password(password);
        clickLoginButton();
    }
}
