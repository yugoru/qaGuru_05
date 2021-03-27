package tests;

import org.junit.jupiter.api.Test;

public class StepTestRun {

    private StepTest steps = new StepTest();
    private final static String REPO = "allure-framework/allure2";
    private final static String PAGE_NAME = "Issues";
    private final static String SEARCH_FOR = "#1195";

    @Test
    void searchRepo(){
        steps.openMainPage();
        steps.searchRepo(REPO);
        steps.clickRepo(REPO);
        steps.goToPage(PAGE_NAME);
        steps.searchFor(SEARCH_FOR);
    }

}
