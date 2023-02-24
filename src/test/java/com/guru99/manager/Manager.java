package com.guru99.manager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.guru99.browsers.Browsers;

public class Manager {
    
    public WebDriver driver;

    @BeforeTest
    public void setup(){
        
        driver = Browsers.chooseBrowser("Firefox");
        driver.get("http://www.demo.guru99.com/V4/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
