package mego.googleSearch.tests;

import mego.googleSearch.pages.resultsPage;
import mego.googleSearch.pages.welcomePage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumAllJunitAndWait.tests.SeleniumBase;

public class searchWithAssertExample {

    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver =base.seleniumInit("https://www.google.com/");
        resultsPage resultPageObject = new resultsPage(driver);
        welcomePage welcomePageObject = new welcomePage(driver);
        welcomePageObject.searchForItem("Dog");
        resultPageObject.assertForFirstLink("dog");


        base.seleniumClose(driver);
    }
}
