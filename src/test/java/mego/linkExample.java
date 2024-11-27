package mego;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumTraining.pageObject.tests.SeleniumBase;

public class linkExample {

    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement hotels = driver.findElement(By.linkText("Hotels"));
        WebElement hotelPartial = driver.findElement(By.partialLinkText("Hot"));
        String  text = hotelPartial.getText();
        hotels.click();
        base.seleniumClose(driver);

    }
}
