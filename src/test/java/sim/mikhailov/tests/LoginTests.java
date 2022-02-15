package sim.mikhailov.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sim.mikhailov.tests.pages.LoginPage;
import sim.mikhailov.tests.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LoginTests extends TestBase{
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    @Feature("MainPage")
    @AllureId("5892")
    @DisplayName("Login test user")
    void LoginTest() {
        step("Open url " + loginPage.url, () ->
                open(loginPage.url));

        step("Enter login name", () ->
                loginPage.enterLoginName());

        step("Enter login password", () ->
                loginPage.enterLoginPass());

        step("Enter login button", () ->
                loginPage.enterLoginButton());

        step("Check successfully Log in", () ->
                mainPage.checkUserName());
    }
}
