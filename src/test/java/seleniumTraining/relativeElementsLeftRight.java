package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class relativeElementsLeftRight {
    public static void main(String[] args) throws InterruptedException {

        seleniumBase base = new seleniumBase();
        String url = "https://advantageonlineshopping.com/#/";
        ChromeDriver driver =  base.seleniumInit(url);
        Thread.sleep(3000);

        WebElement userMenu= driver.findElement(By.id("menuUser"));
        WebElement items = driver.findElement(with(By.tagName("svg")).toRightOf(userMenu));
        Thread.sleep(3000);
        items.click();
        WebElement search = driver.findElement(with(By.tagName("svg")).toLeftOf(userMenu));
search.click();
        base.seleniumClose(driver);

    }
}
