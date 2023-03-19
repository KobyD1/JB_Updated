package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {
    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://demo.applitools.com/#");
        WebElement user = driver.findElement(By.id("username"));
        WebElement pw = driver.findElement(By.id("password"));
        user.click();
        user.clear();
        user.sendKeys("Elaya");
        pw.click();
        pw.clear();
        pw.sendKeys("123");
        WebElement login = driver.findElement(By.id("log-in"));
        login.click();
        base.seleniumClose(driver);

    }
}
