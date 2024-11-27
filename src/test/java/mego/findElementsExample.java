package mego;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElementsExample {
    public static void main(String[] args) {

        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.calculator.net/");
        List<WebElement> buttons =  driver.findElements(By.className("Calculator"));
        Integer  buttonsAmount  = buttons.size();
        buttons.get(16).click();
        base.seleniumClose(driver);

    }
}
