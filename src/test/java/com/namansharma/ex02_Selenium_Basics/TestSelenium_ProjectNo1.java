package com.namansharma.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo1 {

    @Description("Verify that a text katalon website")
    @Test
    public void test_verify_text_katalon(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getPageSource());
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case Passed");
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
        driver.quit();
    }
}
