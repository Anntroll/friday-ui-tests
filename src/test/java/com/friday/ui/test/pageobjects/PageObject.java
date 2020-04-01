package com.friday.ui.test.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class PageObject {

    @Step
    protected void clickElement(WebElement webElement) {
        webElement.click();
        pause();
    }

    protected void pause(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
