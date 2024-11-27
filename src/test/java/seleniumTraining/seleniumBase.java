package seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class seleniumBase {

        public ChromeDriver seleniumInit(String url) {
            System.out.println("Starting...");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");    //fix for chrome version 111
            options.addArguments("--start-maximized");
            options.setAcceptInsecureCerts(true);   // working with none secure(SSL) sites

            options.addArguments("user-data-dir=/directory/path");// set your profile file

            Map<String, Object> prefs = new HashMap<String, Object>();  // define download directory
            prefs.put("download.default_directory", "/directory/path");
            options.setExperimentalOption("prefs", prefs);

            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new  ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //using time unit
            driver.get(url);
            return driver;
        }

        public void seleniumClose(ChromeDriver driver) {
            driver.close();
            driver.quit();
            System.out.println("...Test Completed");

        }
    }


