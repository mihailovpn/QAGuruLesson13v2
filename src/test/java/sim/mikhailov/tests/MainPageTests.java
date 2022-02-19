package sim.mikhailov.tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sim.mikhailov.tests.pages.LoginPage;
import sim.mikhailov.tests.pages.MainPage;

@Feature("MainPage")

public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @BeforeEach
    void logIn(){
        loginPage.logIn();
    }

    @Test
    @DisplayName("Check slogan element text")
    void sloganElementTest() {
        mainPage.checkSloganElementText();
    }

    @Test
    @DisplayName("Check My Data section by Default")
    void myDataSectionByDefaultTest() {
        mainPage.checkCommonInfoText();
    }

    @Test
    @DisplayName("Check My Data section on click")
    void myDataSectionOnClickTest() {
        mainPage.clickOrganisationLabel();
        mainPage.clickMyDataLabel();
        mainPage.checkCommonInfoText();
    }

    @Test
    @DisplayName("Check Settings section on click")
    void settingsSectionOnClickTest() {
        mainPage.clickSettingsLabel();
        mainPage.checkSecurityText();
    }

    @Test
    @DisplayName("Check Organisation section on click")
    void organisationSectionOnClickTest() {
        mainPage.clickOrganisationLabel();
        mainPage.checkOrganisationNameText();
    }
}
