package mego;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayGet {

    public static void main(String[] args) {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver =   base.seleniumInit("https://www.ebay.com/");
        WebElement search =driver.findElement(By.id("gh-ac"));


        base.seleniumClose(driver);
    }
}
