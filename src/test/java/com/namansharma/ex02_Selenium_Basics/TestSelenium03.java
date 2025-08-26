package com.namansharma.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Test
    public void test_Code(){
        // start and stop itself.
        //  If it was a Selenium 3, then we have to do this.

        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://youtube.com/");
    }

}
