package com.namansharma.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {


    @Test
    public void test_code(){

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://youtube.com");
    }

}
