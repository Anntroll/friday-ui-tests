package com.friday.ui.test.tests;

import com.friday.ui.test.pageobjects.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;

public class BaseTest {

    protected WebDriver driver;
    protected String BASE_URL = "https://hello.friday.de/quote/selectPrecondition";
    protected SelectPreconditionPage selectPreconditionPage;
    protected EnterRegistrationDatePage enterRegistrationDatePage;
    protected RegisteredOwnerPage registeredOwnerPage;
    protected SelectVehiclePage selectVehiclePage;
    protected SelectModelPage selectModelPage;
    protected ListWidgetPage listWidgetPage;
    protected EnterBirthDatePage enterBirthDatePage;
    protected CookiePopUpPage cookiePopUpPage;

    @BeforeClass
    public void before() {
        try {
            getDriver();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        initializePageObjects();
    }

    @AfterClass
    public void closeBrowsers() {
            if (driver != null) {
                driver.close();
                driver.quit();
            }
    }

    private void initializePageObjects() {
        selectPreconditionPage = new SelectPreconditionPage(driver);
        registeredOwnerPage = new RegisteredOwnerPage(driver);
        enterRegistrationDatePage = new EnterRegistrationDatePage(driver);
        selectVehiclePage = new SelectVehiclePage(driver);
        selectModelPage = new SelectModelPage(driver);
        listWidgetPage = new ListWidgetPage(driver);
        enterBirthDatePage = new EnterBirthDatePage(driver);
        cookiePopUpPage = new CookiePopUpPage(driver);
    }

    public  void getDriver() throws IllegalAccessException, InstantiationException {
        String browser = System.getProperty("driver", "chrome");
        switch (browser) {
            case "chrome":
                Class<? extends WebDriver> driverClass = ChromeDriver.class;
                WebDriverManager.getInstance(driverClass).setup();
                driver = driverClass.newInstance();
                break;
            case "firefox":
                driverClass = FirefoxDriver.class;
                WebDriverManager.getInstance(driverClass).setup();
                driver = driverClass.newInstance();
                break;
            default:
                driverClass = ChromeDriver.class;
                WebDriverManager.getInstance(driverClass).setup();
                driver = driverClass.newInstance();
                break;
        }
    }

    @Step
    protected void openBasePage() {
        driver.get(BASE_URL);
    }

    @Step
    protected boolean isSearchPaneDisplayed() {
        try {
            await().atMost(2, SECONDS)
                    .until(() -> driver.findElement(By.className("TextInput__textInput--3aA1s")).isEnabled());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
