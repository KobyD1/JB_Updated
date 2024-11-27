package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumTraining.pageObject.tests.SeleniumBase;

public class cssExample {
    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        WebElement login = driver.findElement(By.cssSelector("input[class*='input']"));
        login.click();
        login.sendKeys("standard_user");
        base.seleniumClose(driver);

    }
}
