package org.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginModule  {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/login");

        demoLoginPage de=new demoLoginPage(driver);
        de.loginAs("Rchandran","Ramachandran@123");
    }
}
