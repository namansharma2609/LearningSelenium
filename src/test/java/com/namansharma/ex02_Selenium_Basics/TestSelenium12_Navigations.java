package com.namansharma.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium12_Navigations {


    @Description("Open the URL")
    @Test
    public void test_Navigation(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");

        driver.navigate().to("https://google.com");
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh();
    }
}
