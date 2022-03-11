package com.bridgelabz.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

@Test
public class Locators {
    @Test
    public void locaterscommands() throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhava\\Driver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //driver.findElement(By.id("email")).sendKeys("Bhavanashende661@gmail.com");
        //driver.findElement(By.name("pass")).sendKeys("Bhanu");
        //driver.findElement(By.linkText("Forgotten password?")).click();

        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("Bhavna");
        driver.findElement(By.name("lastname")).sendKeys("Shende");
        driver.findElement(By.id("reg_email__")).sendKeys("bhavanashende661@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bhavanashende661@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Bhavna@123");
        driver.findElement(By.name("birthday_day")).sendKeys("10");
        driver.findElement(By.name("birthday_month")).sendKeys("October");
        driver.findElement(By.name("birthday_year")).sendKeys("1997");
        driver.findElements(By.name("sex")).get(2).click();
        driver.findElement(By.name("preferred_pronoun")).sendKeys("She: Wish her a happy birthday!");
        driver.findElement(By.partialLinkText("Data")).click();
        driver.findElement(By.linkText("Cookie Policy")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.xpath("//input[@id='u_5_b_Od']")).click();
        Thread.sleep(5000);
        driver.close();



    }
}
