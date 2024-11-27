package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class xyzBank {
    public static void main(String[] args) {

        seleniumBase base = new seleniumBase();
        String url = "https://www.calculator.net/";
        ChromeDriver driver =  base.seleniumInit(url);
        List<WebElement> buttons = driver.findElements(By.partialLinkText("Calculators"));
        WebElement button = buttons.get(1);
        button.click();

        base.seleniumClose(driver);
    }
}
