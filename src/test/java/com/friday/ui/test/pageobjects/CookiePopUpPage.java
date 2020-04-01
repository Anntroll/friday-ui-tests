package com.friday.ui.test.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiePopUpPage extends PageObject{
    @FindBy(id = "uc-btn-accept-banner")
    private WebElement acceptButton;

    public CookiePopUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @Step
    public void clickAcceptButton(){
        pause();
        clickElement(acceptButton);
    }
}
