package com.namansharma.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestSelenium14_Close_VS_quit {

    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Close - will close the current tab, not the session (not the all tabs)
        // session id != null
        //webDriver.close();



        webDriver.quit();
        // It will close all the tabs. - session id == null

    }
}
