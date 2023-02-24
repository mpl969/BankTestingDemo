package com.guru99.abstractbase;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.guru99.browsers.Browsers;

public abstract class AbstractPageBase {
    
    protected WebDriverWait wait;

    public AbstractPageBase(){
        PageFactory.initElements(Browsers.getDriver(), this);
    }

}
