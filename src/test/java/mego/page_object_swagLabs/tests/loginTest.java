package mego.page_object_swagLabs.tests;

import mego.page_object_swagLabs.pages.welcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {

    public static void main(String[] args) {
        seleniumBase base  = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");

        welcomePage welcomePage = new welcomePage(driver);
        welcomePage.loginToSwagLabs("standard_user","secret_sauce");
        base.seleniumClose(driver);
    }

}
