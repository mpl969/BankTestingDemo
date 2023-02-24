package com.guru99.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.guru99.abstractbase.AbstractPageBase;

public class Login extends AbstractPageBase{


    @FindBy(name = "uid")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "btnLogin")
    private WebElement loginBtn;

    // Methods

    public void fillUsernameField(String username) {
        usernameField.sendKeys(username);
    }

    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

}
