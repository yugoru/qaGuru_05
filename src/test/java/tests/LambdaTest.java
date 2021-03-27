package tests;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaTest {
    private final static String REPO = "allure-framework/allure2";
    private final static String PAGE_NAME = "Issues";
    private final static String SEARCH_FOR = "#1195";

    @Test
    void searchIssue() {
        step("Открываем главную страницу", () -> open("https://github.com"));
        step("Вводим в поиск 'allure'", () -> {
            $(".header-search-input").setValue(REPO).pressEnter();
        });
        step("Переходим на странцу allure", () -> $(By.linkText(REPO)).click());
        step("Переходим на страницу 'issues'", () -> $(withText(PAGE_NAME)).click());
        step("Проверяем, что на странице есть " + REPO, () -> $(withText(SEARCH_FOR)).click());

    }

}
