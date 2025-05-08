package projectByPageObject.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import projectByPageObject.pages.loginPage;
import projectByPageObject.pages.productPage;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



    public class swagLabsTrainingTest {
        seleniumCommon common = new seleniumCommon();
        private WebDriver driver;
        loginPage loginPage;
        productPage productPage;

        @Before
        public void init() {

            driver =  common.seleniumInit();
            driver.get("https://www.saucedemo.com/");
            loginPage= new loginPage(driver);
            productPage = new productPage(driver);

        }

        @After
        public void teardown() {
            driver.close();

        }


        @Test
        public void verifyUrlTest() throws InterruptedException{
            String url = driver.getCurrentUrl();
            assertEquals("https://www.saucedemo.com/", url,"Page URL  is not as expected ");
        }


        @Test
        public void firstPriceByPageObject() throws InterruptedException {
            loginPage.loginWithUserPw("standard_user","secret_sauce");
            productPage.getFirstPrice();

        }






        @Test
        public void getFirstPrice(){
            driver.get("https://www.saucedemo.com/");
            WebElement user = driver.findElement(By.id("user-name"));
            user.click();
            user.sendKeys("standard_user");
            WebElement pw = driver.findElement(By.name("password"));
            pw.click();
            pw.sendKeys("secret_sauce");
            WebElement button = driver.findElement(By.id("login-button"));
            button.click();
            WebElement firstPrice = driver.findElement(By.className("inventory_item_price"));
            String text = firstPrice.getText();
            System.out.println("first price is "+text);





        }






    }
