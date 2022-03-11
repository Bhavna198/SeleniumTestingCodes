package com.bridgelabz.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTesting {

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhava\\Driver\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create New Account")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Bhavna");

        Thread.sleep(2000);

        driver.findElement(By.name("lastname")).sendKeys("Shende");

        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("bhavanashende661@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bhavanashende661@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.id("password_step_input")).sendKeys("Bhavna@123");

        Thread.sleep(2000);

        driver.findElement(By.name("birthday_day")).sendKeys("10");

        Thread.sleep(2000);

        driver.findElement(By.name("birthday_month")).sendKeys("October");

        Thread.sleep(2000);

        driver.findElement(By.name("birthday_year")).sendKeys("1997");

        Thread.sleep(2000);

        driver.findElements(By.name("sex")).get(2).click();

        Thread.sleep(2000);

        driver.findElement(By.name("preferred_pronoun")).sendKeys("She: Wish her a happy birthday!");

        Thread.sleep(3000);

        driver.findElement(By.name("websubmit")).click();


        Thread.sleep(5000);
        driver.close();
    }
}

