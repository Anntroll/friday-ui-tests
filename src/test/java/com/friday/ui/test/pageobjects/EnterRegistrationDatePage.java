package com.friday.ui.test.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterRegistrationDatePage extends PageObject {

//    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/form/div/div[2]/div/div[1]/input")
//    private WebElement dateForm;

    @FindBy(tagName = "input")
    private WebElement dateForm;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button[2]/span")
    private WebElement submitButton;

    public EnterRegistrationDatePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @Step
    public void fillDateForm(String date){
        dateForm.sendKeys(date);
    }

    @Step
    public void clickSubmitButton(){
        clickElement(submitButton);
    }

}
