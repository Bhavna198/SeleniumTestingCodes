package com.bridgelabz.seleniumtesting;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotCaptureTesting {

    @Test
    public void capturescreenshot() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhava\\Driver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File desFile = new File(".\\screenshot\\" + System.currentTimeMillis() / 1000 + "_facebook.png");

        try {
            FileHandler.copy(srcFile, desFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread.sleep(2000);
        driver.close();
    }

}

