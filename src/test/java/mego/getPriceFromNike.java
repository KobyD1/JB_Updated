package mego;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumTraining.pageObject.tests.SeleniumBase;

import java.util.List;

import static java.lang.Thread.sleep;

public class getPriceFromNike {

    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.nike.com/en/");
        WebElement blackFriday = driver.findElement(By.partialLinkText("Black"));
blackFriday.click();
List<WebElement> prices = driver.findElements(By.className("product-card__price"));

for (int i=0 ;i<3;i++){
    String price = prices.get(i).getText();
    System.out.println("price found the value is "+price);


}
sleep(3000); // adding sleep due to closing driver not alllways success
    base.seleniumClose(driver);
    }
}
