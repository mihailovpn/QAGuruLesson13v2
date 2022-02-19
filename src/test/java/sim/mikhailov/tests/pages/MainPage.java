package sim.mikhailov.tests.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public String userNameLocator = ".user-name";
    public String sloganLocator = ".slogan";
    public String myDataSelector = "nav > a:nth-child(1)";
    public String settingsSelector = "nav > a:nth-child(2)";
    public String organisationSelector = "nav > a:last-child";
    public String commonInfoSelector = "my-common-information h3";
    public String organisationNameSelector = ".scroll-pagination h3";
    public String securitySelector = "h3:first-of-type";


    public String userNameText = " ФАМИЛИЯ006 И. О. ";
    public String sloganText = "Доступ к сервисам электронного правительства";
    public String commonInfoText = "Основная информация ";
    public String organisationNameText = " ОРГАНИЗАЦИЯ 1181280564 ";
    public String securityText = "Безопасность";



    @Step("Check successfully Log in")
    public void checkSuccessfullyLogIn() {
        $(userNameLocator).shouldHave(Condition.text(userNameText));
    }

    @Step("Check slogan element text")
    public void checkSloganElementText() {
        $(sloganLocator).shouldHave(Condition.text(sloganText));
    }

    @Step("Check Common Info element text")
    public void checkCommonInfoText() {
        $(commonInfoSelector).shouldHave(Condition.text(commonInfoText));
    }

    @Step("Check security element text")
    public void checkSecurityText() {
        $(securitySelector).shouldHave(Condition.text(securityText));
    }

    @Step("Check organisation name element text")
    public void checkOrganisationNameText() {
        $(organisationNameSelector).shouldHave(Condition.text(organisationNameText));
    }

    @Step("Click Organisation section label")
    public void clickOrganisationLabel() {
        $(organisationSelector).click();
    }

    @Step("Click Ma Data section label")
    public void clickMyDataLabel() {
        $(myDataSelector).click();
    }

    @Step("Click Settings section label")
    public void clickSettingsLabel() {
        $(settingsSelector).click();
    }



}
