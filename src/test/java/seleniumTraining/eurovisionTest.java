package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumTraining.pageObject.tests.SeleniumBase;

public class eurovisionTest {
    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://eurovisionworld.com/eurovision/2018/israel");
        WebElement login = driver.findElement(By.cssSelector("h1[class*='mm lyrics_header']"));
        login.click();
//        login.sendKeys("standard_user");
        base.seleniumClose(driver);

    }
}
