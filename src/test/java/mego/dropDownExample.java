package mego;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import seleniumTraining.pageObject.tests.SeleniumBase;

public class dropDownExample {
    public static void main(String[] args) {

        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://advantageonlineshopping.com/#/");
        WebElement dropDownCategory = driver.findElement(By.name("categoryListboxContactUs"));
        Select categories = new Select (dropDownCategory);
        categories.selectByIndex(2);
        dropDownCategory.getText();
        base.seleniumClose(driver);

    }
}
