package com.guru99;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.manager.Manager;

/**
 * Unit test for simple App.
 */
public class AppTest extends Manager{
    
    @Test
    public void loginTest(){
        
        driver.findElement(By.name("uid")).sendKeys("mngr479450");
        driver.findElement(By.name("password")).sendKeys("dEtYzaz");
        driver.findElement(By.name("btnLogin")).click();
        
    }
    
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue(true);
    }
}
