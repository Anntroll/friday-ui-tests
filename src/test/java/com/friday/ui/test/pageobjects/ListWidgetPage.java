package com.friday.ui.test.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ListWidgetPage extends PageObject{

    @FindBy(className = "SingleClickListField__container--2_K04")
    private List<WebElement> collection;

    public ListWidgetPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @Step
    public void clickFirstElement(){
        clickElement(collection.get(0));
    }
}
