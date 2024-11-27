package mego;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumTraining.pageObject.tests.SeleniumBase;

import java.util.List;

public class pricesSwagLabs {

    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        WebElement user = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
user.click();
user.sendKeys("standard_user");
password.click();
password.sendKeys("secret_sauce");
WebElement login  = driver.findElement(By.id("login-button"));
login.click();
List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));
for (WebElement price : prices){
String  priceFromPage = price.getText();
    Integer priceAsInt = Integer.parseInt("");
}
WebElement firstPrice = prices.get(0);
String priceAsString = firstPrice.getText();
        System.out.println("Price found "+priceAsString);

        base.seleniumClose(driver);

    }
}
