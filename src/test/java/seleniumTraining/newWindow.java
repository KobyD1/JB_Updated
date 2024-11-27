package seleniumTraining;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindow {
    public static void main(String[] args) {

        seleniumBase base = new seleniumBase();
        String url = "https://advantageonlineshopping.com/#/";
        ChromeDriver driver =  base.seleniumInit(url);
// Opens a new window and switches to new window
        driver.switchTo().newWindow(WindowType.WINDOW);

// Opens BrowserStack homepage in the newly opened window
        driver.navigate().to("https://www.browserstack.com/");
        base.seleniumClose(driver);
    }


}
