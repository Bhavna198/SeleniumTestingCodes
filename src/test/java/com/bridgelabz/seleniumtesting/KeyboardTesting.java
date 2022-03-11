package com.bridgelabz.seleniumtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardTesting {
    @Test
    public void keyboardtesting() throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhava\\Driver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(5000);

        Robot robot = new Robot();
        robot.mouseMove(500, 300);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_I);
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        driver.close();
    }
}

