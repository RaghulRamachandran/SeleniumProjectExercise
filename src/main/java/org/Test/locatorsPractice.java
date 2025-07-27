package org.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locatorsPractice {
    public static void main(String[] args)throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String password=getPassword(driver);
        driver.findElement(By.className("go-to-login-btn")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
        driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys(password);
        waitforelement(4000);
        driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
        driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
        waitforelement(3000);
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();

    }
    public static String getPassword (WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        waitforelement(2000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String password= driver.findElement(By.xpath("//p[@class='infoMsg']")).getText().split("'")[1];
//        String []PasswordArray=Password.split("'");
//        String Password1 = PasswordArray[1].split("'")[0];
        return password;




    }

    private static void waitforelement(int waittime) throws InterruptedException {
        Thread.sleep(waittime);
    }
}

