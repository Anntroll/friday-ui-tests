package com.friday.ui.test.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FridayTest extends BaseTest {

    @DataProvider
    protected Object[][] listPositionProvider() {
        return new Object[][]{
                {0, 0},
                {0, 1},
                {0, 2},
                {1, 0},
                {1, 1},
                {1, 2},
                {2, 0},
                {2, 1},
                {2, 2},
        };
    }

    @Test(dataProvider = "listPositionProvider",
            description = "Go to birth date for three manufacturers and three models")
    public void firstTest(int brandIndex, int modelIndex) {
        openBasePage();
        if (brandIndex == 0 && modelIndex == 0) {
            cookiePopUpPage.clickAcceptButton();
        }
        selectPreconditionPage.clickSubmitButton();
        registeredOwnerPage.clickSubmitButton();
        selectVehiclePage.clickBrand(brandIndex);
        selectModelPage.clickModel(modelIndex);
        while (!isSearchPaneDisplayed()) {
            listWidgetPage.clickFirstElement();
        }
        enterRegistrationDatePage.fillDateForm("121991");
        enterRegistrationDatePage.clickSubmitButton();
        assertThat(enterBirthDatePage.getLabelText()).isEqualTo("Wann wurdest du geboren?");
    }
}
