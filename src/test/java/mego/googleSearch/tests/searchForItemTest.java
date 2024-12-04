package mego.googleSearch.tests;

import mego.googleSearch.pages.resultsPage;
import mego.page_object_swagLabs.pages.productsPage;
import mego.page_object_swagLabs.pages.welcomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumAllJunitAndWait.tests.SeleniumBase;

import static java.lang.Thread.sleep;

public class searchForItemTest {

    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver =base.seleniumInit("https://www.google.com/");

        resultsPage resultPageObject = new resultsPage(driver);
        welcomePage welcomePageObject = new welcomePage(driver);


        base.seleniumClose(driver);
    }

}
