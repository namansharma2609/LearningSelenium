package com.namansharma.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium13_NOHTTPP {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        //webDriver.get("google.com");
        webDriver.get("https://google.com");
        webDriver.quit();
    }
}
