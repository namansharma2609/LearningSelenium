package com.namansharma.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium07_Selenium_Commands {

    @Test
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com/");

        System.out.println(webDriver.getTitle());
        //System.out.println(webDriver.getPageSource());
        System.out.println(webDriver.getCurrentUrl());
    }

}
