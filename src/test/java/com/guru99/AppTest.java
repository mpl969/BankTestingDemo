package com.guru99;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.manager.Manager;
import com.guru99.pages.Login;

/**
 * Unit test for simple App.
 */
public class AppTest extends Manager{
    
    @Test
    public void loginTest(){

        Login login = new Login();

        login.fillUsernameField("mngr479450");
        login.fillPasswordField("dEtYzaz");
        login.clickLoginBtn();

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
