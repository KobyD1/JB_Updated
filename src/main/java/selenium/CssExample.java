package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {
    public static void main(String[] args) throws InterruptedException {
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
        WebElement search = driver.findElement(By.cssSelector("input[type='text']"));
        search.click();
        search.clear();
        search.sendKeys("Test");
        Thread.sleep(5000);
        base.seleniumClose(driver);

    }
}
