package org.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newUserModule {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/register");

        profilePageLoginActions lg = new profilePageLogin(driver);

        lg.registerAs("Raghul", "Ram", "RaghulRam", "RaghulRam@12");

    }
}
