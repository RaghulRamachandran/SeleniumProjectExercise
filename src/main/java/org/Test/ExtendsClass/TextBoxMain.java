package org.Test.ExtendsClass;

import org.Test.Implemetations.TextBox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxMain extends TextBox {
    public TextBoxMain(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        TextBox l = new TextBox(driver);

        l.getTextBoxWebpage("https://demoqa.com/text-box");
        l.Fullname("John Doe");
        l.Email("john@example.com");
        l.CurrentAddress("some street");
        l.PermanentAddress("some Address");
        l.clickSubmitButton();

        driver.quit();
    }
}
