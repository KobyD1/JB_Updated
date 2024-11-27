package seleniumAllJunitAndWait.tests;


import org.openqa.selenium.chrome.ChromeDriver;
import seleniumAllJunitAndWait.pages.LoginAllPage;
import seleniumAllJunitAndWait.pages.ProdAllPage;


public class TestLogin {

    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        ProdAllPage prodPage = new ProdAllPage(driver);
        LoginAllPage loginPage = new LoginAllPage(driver);
        loginPage.loginToPage("standard_user","secret_sauce");
        prodPage.getPrice();
        prodPage.clickOnMenuBtn();
        base.seleniumClose(driver);


    }

}
