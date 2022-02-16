package sim.mikhailov.tests.pages;

import com.codeborne.selenide.Selenide;

public class LoginPage {
    public String url = "https://esia-portal1.test.gosuslugi.ru";
    public String loginNameLocator = "#login";
    public String loginPassLocator = "#password";
    public String loginButtonLocator = "button.plain-button";

    public void enterLoginName() {
        Selenide.$(loginNameLocator).sendKeys("EsiaTest006@yandex.ru");
    }
    public void enterLoginPass() {
        Selenide.$(loginPassLocator).sendKeys("11111111");
    }
    public void enterLoginButton() {
        Selenide.$(loginButtonLocator).click();
    }

    public void logIn() {
        enterLoginName();
        enterLoginPass();
        enterLoginButton();
    }
}
