package projectByPageObject.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class seleniumCommon {


    private WebDriver driver;


        public WebDriver seleniumInit() {
            System.out.println("Starting...");
            WebDriverManager.chromedriver().setup();
            // Automatically downloads the correct driver
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }

        public void seleniumClose(ChromeDriver driver) {

            driver.close();
            System.out.println("Test End");

        }
    }


