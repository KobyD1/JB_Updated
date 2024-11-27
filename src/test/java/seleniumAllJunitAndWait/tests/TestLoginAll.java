package seleniumAllJunitAndWait.tests;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumAllJunitAndWait.pages.LoginAllPage;
import seleniumAllJunitAndWait.pages.ProdAllPage;


public class TestLoginAll {
   public static SeleniumBase base;
   public static ChromeDriver driver ;

    @Before
    public void init() {
         base = new SeleniumBase();
         driver = base.seleniumInit("https://www.saucedemo.com/");

    }

    @After
    public void after(){

        base.seleniumClose(driver);
    }


    @Test()
    public void productPriceAccurateTest() throws InterruptedException {

        ProdAllPage prodPage = new ProdAllPage(driver);
        LoginAllPage loginPage = new LoginAllPage(driver);
        loginPage.loginToPage("standard_user","secret_sauce");
        int price = prodPage.getPrice();
        Assert.assertEquals("Product found but price is not as expected ",29,price);
        prodPage.clickOnMenuBtn();

    }


    @Test()
    public void productPriceLimitTest() throws InterruptedException {

        ProdAllPage prodPage = new ProdAllPage(driver);
        LoginAllPage loginPage = new LoginAllPage(driver);
        loginPage.loginToPage("standard_user","secret_sauce");
        int price = prodPage.getPrice();
        Assert.assertTrue("Product found but price is above than 20$ ",price>20);
        prodPage.clickOnMenuBtn();

    }

    }

