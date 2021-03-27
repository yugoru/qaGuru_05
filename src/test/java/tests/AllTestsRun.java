package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Запуск всех тестов сразу")
public class AllTestsRun {

    private StepTest steps = new StepTest();
    private LambdaTest lambda = new LambdaTest();
    private SelenideTest selenide = new SelenideTest();

    private final static String REPO = "allure-framework/allure2";
    private final static String PAGE_NAME = "Issues";
    private final static String SEARCH_FOR = "#1195";

    @Test
    @DisplayName("StepTest")
    @Owner("yugoru")
    void searchRepoStep() {
        steps.openMainPage();
        steps.searchRepo(REPO);
        steps.clickRepo(REPO);
        steps.goToPage(PAGE_NAME);
        steps.searchFor(SEARCH_FOR);
    }

    @Test
    @DisplayName("LambdaTest")
    @Owner("yugoru")
    void searchRepoLambda() {
        lambda.searchIssue(REPO, PAGE_NAME, SEARCH_FOR);
    }

    @Test
    @DisplayName("SelenideTest")
    @Owner("yugoru")
    void searchRepoSelenide() {
        selenide.searchIssue(REPO, PAGE_NAME, SEARCH_FOR);
    }


}
