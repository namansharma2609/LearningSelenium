package com.namansharma.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium18_LinkText_Partial_Text_TagName_Locators {

    @Description("Open the trial page for app.vwo website")
    @Owner("Naman Sharma")
    @Test
    public void test_start_trial() {

        //Step 1 - Open the website app.vwo.com
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        // Step 2 - Find Start a free trial link and
        // <a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link Td(n)"
        // data-qa="bericafeqo">Start a free trial</a>

        WebElement start_free_trial_button = driver.findElement(By.partialLinkText("Start a free trial"));
        start_free_trial_button.click();

        //    Step 3 - Fill in the details in Business Email section on
        //    <input class="W(100%) Py(14px) input-text"
        //    placeholder="name@yourcompany.com"
        //    type="email"
        //    id="page-v1-step1-email"
        //    name="email"
        //    data-qa="page-su-step1-v1-email"
        //    required="">

        WebElement business_email_section = driver.findElement(By.name("email"));
        business_email_section.sendKeys("abc@testdata.com");


        // Step 4 - Click on the Radio Button to Accept to VWO's
        // <input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox"
        //name="gdpr_consent_checkbox"
        // id="page-free-trial-step1-cu-gdpr-consent-checkbox"
        // value="true"
        // data-qa="page-free-trial-step1-gdpr-consent-checkbox">

        WebElement checkbox_privacy_policy = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox_privacy_policy.click();


    }
}
