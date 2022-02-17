package sim.mikhailov.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void setSettings() {
    }

    @AfterAll
    static void takeScreenshot() {
    }

    @AfterEach
    void clearCache() {
        Selenide.webdriver().driver().clearCookies();
    }
}
