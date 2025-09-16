package org.Test.Implemetations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Checkbox {
    WebDriver driver;

    public Checkbox(WebDriver driver) throws InterruptedException {
//        this.driver=driver;
//        driver.get("http://demoqa.com/checkbox");
        //driver.get("https://demoqa.com/webtables");
       // driver.findElement(By.className("custom-control-label")).click();
//        driver.findElement(By.id("edit-record-1")).click();
//        driver.findElement(By.id("firstName")).clear();
//        driver.findElement(By.id("firstName")).sendKeys("Raam");
//        driver.findElement(By.id("submit")).click();
//        Thread.sleep(5000);
//       String name= driver.findElement(By.className("rt-td")).getText();
//        //System.out.println(name);
//        driver.findElement(By.id("searchBox")).sendKeys("Raa");
//      //  driver.findElement(By.className("input-group-text")).click();
//        String addedName=driver.findElement(By.className("rt-td")).getText();
//        System.out.println(addedName);
//        System.out.println(name);
//        if(name.equals(addedName)){
//            System.out.println("Mass ");
//        }else{
//            System.out.println("waste");
//        }
//        driver.get("https://demoqa.com/buttons");
//       WebElement doubleClickElement= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//
//       Actions actions=new Actions(driver);
//       actions.doubleClick(doubleClickElement).perform();
//      String Text=driver.findElement(By.id("doubleClickMessage")).getText();
//        System.out.println(Text);
//
//        WebElement rightClickElement=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//        Actions actions1=new Actions(driver);
//        Thread.sleep(5000);
//        actions1.contextClick(rightClickElement).perform();
//        Thread.sleep(5000);
//        String rightText=driver.findElement(By.id("rightClickMessage")).getText();
//        Thread.sleep(5000);
//        System.out.println(rightText);
//    driver.get("https://demoqa.com/links");
//    WebElement newWindow=driver.findElement(By.id("https://demoqa.com/links"));
//    newWindow.click();
//
//    String parentWindow= driver.getWindowHandle();
//
//        driver.get("https://demoqa.com/upload-download");
//        driver.findElement(By.id("downloadButton")).click();
//
//        driver.get("https://demoqa.com/browser-windows");
//        String mainWindow=driver.getWindowHandle();
//        driver.findElement(By.id("tabButton")).click();
//        Set<String> allWindows=driver.getWindowHandles();
//
//        for(String windows:allWindows){
//            if(!windows.equals(mainWindow)){
//                driver.switchTo().window(windows);
//                System.out.println("Switched to child Window"+driver.getTitle());
//                String childwindowtext=driver.findElement(By.id("sampleHeading")).getText();
//                System.out.println(childwindowtext);
//                driver.close();
//                driver.switchTo().window(mainWindow);
//                driver.quit();
//            }
//        }
//        driver.quit();

   //     driver.get("https://demoqa.com/alerts");
//        driver.findElement(By.id("alertButton")).click();
//        Alert alert=driver.switchTo().alert();
//        System.out.println("Alert message"+alert.getText());
//        alert.accept();
//        driver.findElement(By.id("confirmButton")).click();
//        Alert confirm=driver.switchTo().alert();
//        System.out.println("Alert message"+confirm.getText());
//        confirm.accept();

//        driver.findElement(By.id("promtButton")).click();
//        Alert promptAlert=driver.switchTo().alert();
//        System.out.println("promptAlertMessage"+promptAlert.getText());
//        String name="Ramachandran";
//        promptAlert.sendKeys(name);
//        promptAlert.accept();
//        String alertText=driver.findElement(By.id("promptResult")).getText();
//        if(name.equals(alertText)){
//            System.out.println("Elei Muthu ne tham le");
//        }else{
//            System.out.println("Inum Konjam payirchi vendumo");
//        }

//        driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        System.out.println("Alert is present"+alert.getText());
//        alert.accept();
//        driver.quit();

        driver.get("https://demoqa.com/auto-complete");
        String [] colors={"Red"};
//       WebElement inputBox=driver.findElement(By.id("autoCompleteMultipleInput"));
        WebElement inputBox=driver.findElement(By.id("autoCompleteSingleInput"));
        Thread.sleep(8000);

       for(String color:colors){
           inputBox.sendKeys(color);
           inputBox.sendKeys(Keys.ENTER);
//
       }
       driver.quit();


        //div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']


//        driver.findElement(By.className("rct-icon rct-icon-expand-close")).click();
        this.driver = driver;
        //driver.get("https://demoqa.com/checkbox");
//        driver.get("https://demoqa.com/radio-button");
//}
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        Checkbox a= new Checkbox(driver);

    }





}
