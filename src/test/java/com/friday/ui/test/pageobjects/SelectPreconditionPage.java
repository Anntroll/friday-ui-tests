package com.friday.ui.test.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPreconditionPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button")
    private WebElement submitButton;

    public SelectPreconditionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Step
    public void clickSubmitButton() {
        clickElement(submitButton);
    }
}
