package com.namansharma.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium08_Maximize_Minimize {

    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");

        //webDriver.manage().window().maximize();
        webDriver.manage().window().minimize();


    }
}
