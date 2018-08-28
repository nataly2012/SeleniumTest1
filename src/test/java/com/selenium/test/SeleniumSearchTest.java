package com.selenium.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumSearchTest {

    private static WebDriver driver;

    static String word = "selenium";


    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }
    @Test
    public void result(){

        MainProperties page = PageFactory.initElements(driver, MainProperties.class);
        page.searchFor("Selenium");
        List<WebElement> newlist = page.searchResult();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         for (WebElement e:newlist){
             Assert.assertTrue(e.getText().contains("Selenium"));
         }
          }
    @AfterClass
    public static void tearDown() {

        driver.quit();
    }
}
