package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App
{
    public static void main( String[] args )
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        WebDriver pDriver = new ChromeDriver(chromeOptions);

        pDriver.get("https://www.saucedemo.com");
        pDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        pDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        pDriver.findElement(By.id("login-button")).click();
        pDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        pDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        pDriver.findElement(By.id("shopping_cart_container")).click();
        pDriver.findElement(By.id("remove-sauce-labs-backpack")).click();
        pDriver.findElement(By.id("checkout")).click();
        pDriver.findElement(By.id("first-name")).sendKeys("Christian");
        pDriver.findElement(By.id("last-name")).sendKeys(" López");
        pDriver.findElement(By.id("postal-code")).sendKeys("10080");
        pDriver.findElement(By.id("continue")).click();
        pDriver.findElement(By.id("finish")).click();
    }
}
