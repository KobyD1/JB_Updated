package selenium.pageObjectExample.tests;


import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pageObjectExample.pages.LoginPage;
import selenium.pageObjectExample.pages.ProdPage;


public class TestLogin {

    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        ProdPage prodPage = new ProdPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToPage("standard_user","secret_sauce");
        prodPage.getPrice();
        prodPage.clickOnMenuBtn();
        base.seleniumClose(driver);



    }

}
