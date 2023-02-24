package com.guru99;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.manager.Manager;
import com.guru99.pages.Login;

import resources.PasswordEncrypter;

/**
 * Unit test for simple App.
 */
public class AppTest extends Manager{
    
    @Test
    public void loginTest() throws Exception{

        Login login = new Login();
        String username = "mngr479450";
        String password = "dEtYzaz";
        String encryptedPassword = PasswordEncrypter.encrypt(password);
        

        login.fillUsernameField(username);
        login.fillPasswordField(PasswordEncrypter.decrypt(encryptedPassword));
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
