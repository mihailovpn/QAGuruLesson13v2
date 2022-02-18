package sim.mikhailov.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sim.mikhailov.tests.pages.LoginPage;
import sim.mikhailov.tests.pages.MainPage;

public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @BeforeEach
    void logIn(){
        loginPage.logIn();
    }

    @Test
    @Feature("MainPage")
    @DisplayName("Check slogan element text")
    void sloganElementTest() {
        Selenide.$(mainPage.sloganLocator).
                shouldHave(Condition.text(mainPage.sloganText));
    }
}
