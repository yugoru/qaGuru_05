package tests;


import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StepTest {


    @Step
    public void openMainPage() {
        open("https://github.com");
    }

    @Step
    public void searchRepo(String repo) {
        $(".header-search-input").setValue(repo).pressEnter();

    }

    @Step
    public void clickRepo(String repo) {
        $(By.linkText(repo)).click();
    }

    @Step
    public void goToPage(String pageName) {
        $(withText(pageName)).click();

    }

    @Step
    public void searchFor(String searchFor) {
        $(withText(searchFor)).click();

    }

}



