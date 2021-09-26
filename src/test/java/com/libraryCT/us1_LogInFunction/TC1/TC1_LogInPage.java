package com.libraryCT.us1_LogInFunction.TC1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_LogInPage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement emailBox = driver.findElement(By.id("inputEmail"));
        emailBox.sendKeys("librarian47@library");

        WebElement passwordBox = driver.findElement(By.name("inputPassword"));
        passwordBox.sendKeys("Sdet2022*");

        WebElement SigninBtn = driver.findElement(By.name("Sign in"));
        SigninBtn.click();

        driver.quit();


    }
}





