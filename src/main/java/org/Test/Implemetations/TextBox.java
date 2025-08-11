package org.Test.Implemetations;

import org.Test.Interfaces.demoQaLoginPageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox implements demoQaLoginPageActions.TextBoxActions {
    WebDriver driver;

    public TextBox(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void getTextBoxWebpage(String WebPage) throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(5000);
    }

    @Override
    public void Fullname(String Fullname) throws InterruptedException {
        driver.findElement(By.xpath("//input[@class=' mr-sm-2 form-control']")).sendKeys("Rama");
        Thread.sleep(5000);

    }

    @Override
    public void Email(String Email) throws InterruptedException {
      driver.findElement(By.xpath("//input[@type='email' or @id='userEmail']")).sendKeys("ramachandran2898@gmaiol.com");
        Thread.sleep(5000);
    }

    @Override
    public void CurrentAddress(String CurrentAddress) throws InterruptedException {
    driver.findElement(By.xpath("//textarea[@id='currentAddress' and @className='form-control']")).sendKeys("Some Address");
        Thread.sleep(5000);
    }

    @Override
    public void PermanentAddress(String PermanentAddress) throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Permanent Address");
        Thread.sleep(5000);
    }

    @Override
    public void clickSubmitButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='submit' and @className='btn btn-primary']")).click();
        Thread.sleep(5000);
    }
}
