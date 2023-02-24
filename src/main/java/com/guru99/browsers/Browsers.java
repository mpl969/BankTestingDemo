package com.guru99.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {
    
    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriver chooseBrowser(String browser){

        switch (browser) {
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                return driver;
                
                
                
                default:
                    return driver;
                
        }

    }




}
