package sim.mikhailov.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sim.mikhailov.tests.pages.LoginPage;
import sim.mikhailov.tests.pages.MainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Feature("LoginPage")

public class LoginTests extends TestBase{
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Check log in elements")
    void loginElementsTests() {
        loginPage.checkLabelForUsernameInput();
        loginPage.checkLabelForPasswordInput();
    }

    @Test
    //@AllureId("5892")
    @DisplayName("Successful log in test user")
    void loginTests() {
        loginPage.enterCorrectUsername();
        loginPage.enterCorrectPassword();
        loginPage.enterLogInButton();
        mainPage.checkSuccessfullyLogIn();
    }

    @Test
    @DisplayName("Can't log in with incorrect username")
    void loginWithIncorrectUsernameTests() {
        loginPage.enterIncorrectUsername();
        loginPage.enterCorrectPassword();
        loginPage.enterLogInButton();
        loginPage.checkErrorWhenLogIn();
    }

    @Test
    @DisplayName("Can't log in with incorrect password")
    void loginWithIncorrectPasswordTests() {
        loginPage.enterCorrectUsername();
        loginPage.enterIncorrectPassword();
        loginPage.enterLogInButton();
        loginPage.checkErrorWhenLogIn();
    }

}
