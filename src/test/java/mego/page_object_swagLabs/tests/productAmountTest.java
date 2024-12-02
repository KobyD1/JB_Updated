package mego.page_object_swagLabs.tests;

import mego.page_object_swagLabs.pages.productsPage;
import mego.page_object_swagLabs.pages.welcomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumAllJunitAndWait.tests.SeleniumBase;

public class productAmountTest {

    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver =base.seleniumInit("https://www.saucedemo.com/");
        welcomePage welcomePage = new welcomePage(driver);
        productsPage productsPage = new productsPage(driver);

        welcomePage.loginToSwagLabs("standard_user","secret_sauce");


        base.seleniumClose(driver);
    }

}
