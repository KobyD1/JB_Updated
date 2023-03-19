package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsCss {
    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        WebElement user = driver.findElement(By.cssSelector("input[class='input_error form_input']"));
        WebElement pw = driver.findElement(By.cssSelector("input[type='password']"));
        user.click();
        user.clear();
        user.sendKeys("standard_user");
        pw.click();
        pw.clear();
        pw.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));
        login.click();

        base.seleniumClose(driver);


    }
}
