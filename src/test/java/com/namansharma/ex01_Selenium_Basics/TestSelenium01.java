package com.namansharma.ex01_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_Code(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com/");
        webDriver.quit();
    }

    @Test
    public void test_Code1(){
        Assert.assertEquals("Naman","Naman");
    }

}
