package sim.mikhailov.tests.pages;

import com.codeborne.selenide.Selenide;

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

    public void enterCorrectUsername() {
        Selenide.$(usernameLocator).sendKeys(correctUsername);
    }

    public void enterIncorrectUsername() {
        Selenide.$(usernameLocator).sendKeys(incorrectUsername);
    }

    public void enterCorrectPassword() {
        Selenide.$(passwordLocator).sendKeys(correctPassword);
    }

    public void enterIncorrectPassword() {
        Selenide.$(passwordLocator).sendKeys(incorrectPassword);
    }

    public void enterLogInButton() {
        Selenide.$(logInButtonLocator).click();
    }

    public void logIn() {
        enterCorrectUsername();
        enterCorrectPassword();
        enterLogInButton();
    }
}
