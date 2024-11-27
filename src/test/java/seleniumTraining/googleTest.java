package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTest {
    public static void main(String[] args) {
        seleniumBase base = new seleniumBase();
     ChromeDriver driver = base.seleniumInit("https://www.google.com/");
        WebElement search = driver.findElement(By.name("q"));
        search.click();
        search.sendKeys("dog");
        search.sendKeys(Keys.ENTER);
        WebElement results = driver.findElement(By.id("result-stats"));
        String searchResults = results.getText();
        System.out.println(searchResults);
        base.seleniumClose(driver);



    }
}
