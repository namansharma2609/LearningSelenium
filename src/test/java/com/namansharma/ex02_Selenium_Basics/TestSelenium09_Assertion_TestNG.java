package com.namansharma.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;



public class TestSelenium09_Assertion_TestNG {

    @Description("Verify that title is visible")
    @Test
    public void test_code(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");

        //TestNG Assertions
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.google.com/");

        //AssertJ
        assertThat(webDriver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

    }
}
