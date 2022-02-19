package sim.mikhailov.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public String url = "https://esia-portal1.test.gosuslugi.ru";
    public String usernameLocator = "#login";
    public String passwordLocator = "#password";
    public String logInButtonLocator = "button.plain-button";
    public String usernameLabelLocator = "esia-input > label";
    public String passwordLabelLocator = "esia-input-password label";
    public String errorLogInLocator = ".error-label";

    public String correctUsername = "EsiaTest006@yandex.ru";
    public String incorrectUsername = "EsiaTest004@yandex.com";
    public String correctPassword = "11111111";
    public String incorrectPassword = "22222222";
    public String errorLogInText = " Неверные логин или пароль ";
    public String usernameLabelText = "Телефон  /  Email  /  СНИЛС";
    public String passwordLabelText = "Пароль";



    @Step("Enter correct username")
    public void enterCorrectUsername() {
        Selenide.$(usernameLocator).sendKeys(correctUsername);
    }

    @Step("Enter incorrect username")
    public void enterIncorrectUsername() {
        Selenide.$(usernameLocator).sendKeys(incorrectUsername);
    }

    @Step("Enter correct password")
    public void enterCorrectPassword() {
        Selenide.$(passwordLocator).sendKeys(correctPassword);
    }

    @Step("Enter incorrect password")
    public void enterIncorrectPassword() {
        Selenide.$(passwordLocator).sendKeys(incorrectPassword);
    }

    @Step("Click Log in button")
    public void enterLogInButton() {
        Selenide.$(logInButtonLocator).click();
    }

    @Step("Check error when Log in")
    public void checkErrorWhenLogIn() {
        $(errorLogInLocator).shouldHave(Condition.text(errorLogInText));
    }

    @Step("Log in")
    public void logIn() {
        enterCorrectUsername();
        enterCorrectPassword();
        enterLogInButton();
    }

    @Step("Check label for username input")
    public void checkLabelForUsernameInput() {
        $(usernameLabelLocator).shouldHave(Condition.text(usernameLabelText));
    }

    @Step("Check label for password input")
    public void checkLabelForPasswordInput() {
        $(passwordLabelLocator).shouldHave(Condition.text(passwordLabelText));
    }

}
