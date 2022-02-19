package sim.mikhailov.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sim.mikhailov.tests.pages.LoginPage;
import sim.mikhailov.tests.pages.MainPage;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @BeforeEach
    void logIn(){
        step("Log in", () ->
                loginPage.logIn());
    }

    @Test
    @Feature("MainPage")
    @DisplayName("Check slogan element text")
    void sloganElementTest() {
        step("Check slogan element text " + loginPage.url, () ->
                $(mainPage.sloganLocator).
                    shouldHave(Condition.text(mainPage.sloganText)));
    }
    @Test
    @Feature("MainPage")
    @DisplayName("Check My Data section by Default")
    void myDataSectionByDefaultTest() {
        step("Check My Data section element " + loginPage.url, () ->
                $(mainPage.commonInfoSelector).
                    shouldHave(Condition.text(mainPage.commonInfoText)));
    }
    @Test
    @Feature("MainPage")
    @DisplayName("Check My Data section on click")
    void myDataSectionOnClickTest() {
        step("Click Organisation section element " + loginPage.url, () ->
                $(mainPage.organisationSelector).click());

        step("Click My Data section element " + loginPage.url, () ->
                $(mainPage.myDataSelector).click());

        step("Check My Data section element " + loginPage.url, () ->
                $(mainPage.commonInfoSelector).
                        shouldHave(Condition.text(mainPage.commonInfoText)));
    }

    @Test
    @Feature("MainPage")
    @DisplayName("Check Settings section on click")
    void settingsSectionOnClickTest() {
        step("Click Settings section element " + loginPage.url, () ->
                $(mainPage.settingsSelector).click());

        step("Check Organisation section element " + loginPage.url, () ->
                $(mainPage.securitySelector).
                        shouldHave(Condition.text(mainPage.securityText)));
    }

    @Test
    @Feature("MainPage")
    @DisplayName("Check Organisation section on click")
    void organisationSectionOnClickTest() {
        step("Click Organisation section element " + loginPage.url, () ->
                $(mainPage.organisationSelector).click());

        step("Check Organisation section element " + loginPage.url, () ->
                $(mainPage.organisationNameSelector).
                        shouldHave(Condition.text(mainPage.organisationNameText)));
    }
}
