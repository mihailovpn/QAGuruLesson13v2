package sim.mikhailov.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class MainPage {
    public String userName = " ФАМИЛИЯ006 И. О. ";
    public String userNameLocator = ".user-name";

    public void checkUserName() {
        Selenide.$(userNameLocator).shouldHave(Condition.text(userName));
    }
}
