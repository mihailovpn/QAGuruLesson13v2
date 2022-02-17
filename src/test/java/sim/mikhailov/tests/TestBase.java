package sim.mikhailov.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import sim.mikhailov.tests.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {

    LoginPage loginPage = new LoginPage();

    @BeforeAll
    static void setSettings() {
    }

    @AfterAll
    static void takeScreenshot() {
    }

    @BeforeEach
    void openUrl() {
        step("Open url " + loginPage.url, () ->
                open(loginPage.url));
    }

    @AfterEach
    void clearCache() {
        Selenide.webdriver().driver().clearCookies();
    }
}
