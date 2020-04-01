package com.friday.ui.test.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectVehiclePage extends PageObject {
    @FindBy(className = "SingleClickListField__button--3UZuT")
    private List<WebElement> brands;

    public SelectVehiclePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Step
    private List<WebElement> getAllBrands() {
        return brands;
    }

    @Step
    public void clickBrand(int index) {
        clickElement(getAllBrands().get(index));
    }
}
