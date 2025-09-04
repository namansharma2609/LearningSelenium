package com.namansharma.Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class awesomeqa {


    @Description("Practicing the awesomeqa.com website")
    @Test
    public void practice_awesomeqa_website(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname_input = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstname_input.sendKeys("Naman");

        WebElement lastname_input = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        lastname_input.sendKeys("Sharma");

        WebElement gender_radio = driver.findElement(By.id("sex-0"));
        gender_radio.click();

        WebElement experience_button = driver.findElement(By.xpath("//input[@id=\"exp-3\"]"));
        experience_button.click();

        WebElement profession_button = driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
        profession_button.click();

        WebElement automation_tools_button = driver.findElement(By.xpath("//input[@id=\"tool-2\"]"));
        automation_tools_button.click();

        WebElement continent_selector = driver.findElement(By.xpath("//select[@id='continents']/option[text()='Europe']"));
        continent_selector.click();

        WebElement selenium_commands_selector = driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='Navigation Commands']"));
        selenium_commands_selector.click();

        WebElement upload_image_button = driver.findElement(By.xpath("//input[@id=\"photo\"]"));
        upload_image_button.sendKeys("C:\\Users\\sharm\\OneDrive\\Pictures\\Saved Pictures\\ganesh.jpg");


        WebElement submit_button = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        submit_button.click();

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
