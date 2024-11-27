package projectByPageObject.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import projectByPageObject.pages.loginPage;
import projectByPageObject.pages.productPage;

public class productTest {
    public static void main(String[] args) {

        String url = "https://www.saucedemo.com/";

        seleniumMain main = new seleniumMain();
        ChromeDriver driver = main.seleniumInit(url);
        loginPage loginPage = new loginPage(driver);
        productPage productPage = new productPage(driver);


        loginPage.clickOnUser();


        main.seleniumClose(driver);
    }

}
