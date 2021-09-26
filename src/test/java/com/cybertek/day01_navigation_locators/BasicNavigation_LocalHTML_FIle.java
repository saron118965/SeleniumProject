package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTML_FIle {
    public static void main(String[] args) {


        //set up chrome driver, open chrome browser
        WebDriverManager.chromedriver().setup();
        //navigate to that html using that path you copied fromthe browser
        WebDriver driver = new ChromeDriver();
        // file:///C:/Users/Fiyona/Desktop/HTML_Class/Day2.html
        driver.get("file:///C:/Users/Fiyona/Desktop/HTML_Class/Day2.html");

        //close the  browser
        driver.quit();
    }
}
