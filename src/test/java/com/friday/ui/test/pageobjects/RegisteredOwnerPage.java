package com.friday.ui.test.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredOwnerPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button[2]")
    private WebElement submitButton;

    public RegisteredOwnerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Step
    public void clickSubmitButton() {
        clickElement(submitButton);
    }
}
