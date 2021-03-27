package tests;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @Test
    void searchIssue() {
        open("https://github.com");
        $(".header-search-input").setValue("allure").pressEnter();
        $("a[href='/allure-framework/allure2']").click();
        $("a[href='/allure-framework/allure2/issues']").click();
        $("a[href='/allure-framework/allure2/issues/1195']").shouldHave(text("Add English (ISO-8601) locale"));
    }


}
