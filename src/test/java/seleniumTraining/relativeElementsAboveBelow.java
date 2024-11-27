package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class relativeElementsAboveBelow {
    public static void main(String[] args) throws InterruptedException {

        seleniumBase base = new seleniumBase();
        String url = "https://advantageonlineshopping.com/#/";
        ChromeDriver driver =  base.seleniumInit(url);
        Thread.sleep(3000);
        WebElement userIcon= driver.findElement(By.id("menuUser"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(userIcon));

        Thread.sleep(3000);
        userIcon.click();
        WebElement userMenu =driver.findElement(By.name("username"));
        WebElement pwByRelative = driver.findElement(with(By.tagName("input")).below(userMenu));
        wait.until(ExpectedConditions.visibilityOf(pwByRelative));

        pwByRelative.click();
        pwByRelative.sendKeys("abc");
        WebElement password =driver.findElement(By.name("password"));

        WebElement userByRelative = driver.findElement(with(By.tagName("input")).above(password));
        userByRelative.click();
        userByRelative.sendKeys("def");
        base.seleniumClose(driver);

    }
}
