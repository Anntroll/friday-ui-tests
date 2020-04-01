package com.friday.ui.test.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterBirthDatePage {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/form/div[1]")
    private WebElement label;

    public EnterBirthDatePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @Step
    public String getLabelText(){
        return label.getText();
    }

}
