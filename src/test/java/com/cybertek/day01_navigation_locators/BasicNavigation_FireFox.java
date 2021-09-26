package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigation_FireFox {
    public static void main(String[] args) {

        //1. set up FireFox driver
        WebDriverManager.firefoxdriver().setup();
        //2. Create Wedriver instance using FireFoxDriver object
        WebDriver driver = new  FirefoxDriver();
        //3. navigate tp "https://cybertekschool.com"
        driver.get("https://cybertekschool.com");

        System.out.println("About to quit ");
        // quit the browser
        driver.quit();





    }
}
