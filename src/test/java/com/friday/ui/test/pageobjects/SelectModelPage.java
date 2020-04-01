package com.friday.ui.test.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectModelPage extends PageObject {

    @FindBy(className = "SingleClickListField__button--3UZuT")
    private List<WebElement> models;

    public SelectModelPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getModels() {
        return models;
    }

    @Step
    public void clickModel(int modelIndex) {
        clickElement(getModels().get(modelIndex));
    }
}
