package sim.mikhailov.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
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
    @Feature("LoginPage")
    @DisplayName("Check log in elements")
    void loginElementsTests() {
        step("Check label for login input", () ->
                Selenide.$(loginPage.usernameLabelLocator).
                        shouldHave(Condition.text("Телефон  /  Email  /  СНИЛС")));

        step("Check label for login password", () ->
                Selenide.$(loginPage.passwordLabelLocator).
                        shouldHave(Condition.text("Пароль")));
    }

    @Test
    @Feature("LoginPage")
    //@AllureId("5892")
    @DisplayName("Successful log in test user")
    void loginTests() {

        step("Enter login name", () ->
                loginPage.enterCorrectUsername());

        step("Enter login password", () ->
                loginPage.enterCorrectPassword());

        step("Enter login button", () ->
                loginPage.enterLogInButton());

        step("Check successfully Log in", () ->
                Selenide.$(mainPage.userNameLocator).shouldHave(Condition.text(mainPage.userNameText)));
    }

    @Test
    @Feature("LoginPage")
    //@AllureId("5892")
    @DisplayName("Can't log in with incorrect username")
    void loginWithIncorrectUsernameTests() {
        step("Enter login name", () ->
                loginPage.enterIncorrectUsername());

        step("Enter login password", () ->
                loginPage.enterCorrectPassword());

        step("Enter login button", () ->
                loginPage.enterLogInButton());

        step("Check successfully Log in", () ->
                Selenide.$(loginPage.errorLogInLocator).shouldHave(Condition.text(loginPage.errorLogInText)));
    }

    @Test
    @Feature("LoginPage")
    //@AllureId("5892")
    @DisplayName("Can't log in with incorrect password")
    void loginWithIncorrectPasswordTests() {
        step("Enter login name", () ->
                loginPage.enterCorrectUsername());

        step("Enter login password", () ->
                loginPage.enterIncorrectPassword());

        step("Enter login button", () ->
                loginPage.enterLogInButton());

        step("Check successfully Log in", () ->
                Selenide.$(loginPage.errorLogInLocator).shouldHave(Condition.text(loginPage.errorLogInText)));
    }


}
