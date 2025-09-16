package org.Test.Implemetations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PracticeTestExceptions {
    WebDriver driver;
    public PracticeTestExceptions(WebDriver driver) throws InterruptedException {
        this.driver=driver;
//        driver.get("https://practicetestautomation.com/practice-test-login/");
//        String userName=driver.findElement(By.xpath("//section[@id='login']//b[1]")).getText();
//        System.out.println(userName);
//        String password=driver.findElement(By.xpath("//section[@id='login']//b[2]")).getText();
//        System.out.println(password);
//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//        driver.findElement(By.xpath("//button[@id='submit']")).click();
//        String successMessage=driver.findElement(By.xpath("//p[@class='has-text-align-center']")).getText();
//        System.out.println(successMessage);
//        driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")).click();
//        driver.quit();
//        driver.get("https://practicetestautomation.com/practice-test-exceptions/");
//        driver.findElement(By.xpath("//button[@id='add_btn']")).click();
//        Thread.sleep(9000);
//        driver.findElement(By.className("input-field")).sendKeys("Noodles");

//        driver.get("https://demoqa.com/tool-tips");
//        WebElement hoverinngElement=driver.findElement(By.id("toolTipButton"));
//        Actions actions=new Actions(driver);
//        actions.moveToElement(hoverinngElement).perform();

//        driver.get("https://demoqa.com/menu#");
//        WebElement MainItem2=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
//        Actions actions=new Actions(driver);
//        actions.moveToElement(MainItem2).perform();
//        Thread.sleep(5000);
//        WebElement SubList=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
//        actions.moveToElement(SubList).perform();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']")).click();
//        driver.quit();

//        driver.get("https://demoqa.com/select-menu");
//        Thread.sleep(5000);
//       WebElement oldStyleDropDown= driver.findElement(By.id("oldSelectMenu"));
//       Select select=new Select(oldStyleDropDown);
//       select.selectByIndex(3);
//      String a= select.getFirstSelectedOption().getText();
//      if(a.equals("Yellow")){
//          System.out.println("Awesome");
//      }else {
//          System.out.println("mosam");
//      }

//        WebElement multiDropDown = driver.findElement(By.xpath("//div[@class='css-2b097c-container']"));
//      // WebElement multiDropDown=driver.findElement(By.className("css-1okebmr-indicatorSeparator"));
//       multiDropDown.click();
//        Thread.sleep(5000);
//        WebElement greenOption = driver.findElement(By.xpath("//div[text()='Green']"));
//        greenOption.click();
//        Thread.sleep(5000);
//        multiDropDown.click();
//        WebElement blackOption = driver.findElement(By.xpath("//div[text()='Black']"));
//        blackOption.click();

//        driver.get("https://demoqa.com/sortable");
//        driver.findElement(By.id("demo-tab-grid")).click();
//        driver.findElement(By.xpath("//div[@class='list-group-item list-group-item-action']")).click();
//        driver.quit();


//       WebElement dropdown =  driver.findElement(By.className("css-tlfecz-indicatorContainer"));
//        Select select=new Select(dropdown);
//        Thread.sleep(5000);
//        select.selectByIndex(1);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(3000);
        List<WebElement> sizes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(sizes.size());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println( driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        int i=1;
        while (i<5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;

        }
//        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        driver.findElement(By.xpath("//a[@text='Madurai (IXM)']")).click();
//        Thread.sleep(3000);
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@value='CCJ'])[2]"))).click();
//
//        //li[@class='city_selected ']//a[@value='CCJ'][normalize-space()='Kozhikode (CCJ)']
//        Thread.sleep(3000);
//
//        }
//        driver.quit();
//        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
//        Thread.sleep(4000);
//        List<WebElement> options= driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
//        for (WebElement option:options){
//            if(option.getText().equalsIgnoreCase("India")){
//                option.click();
//                break;
//            }
//
//        }


    }
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        PracticeTestExceptions p=new PracticeTestExceptions(driver);
}}
