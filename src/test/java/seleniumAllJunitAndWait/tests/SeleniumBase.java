package seleniumAllJunitAndWait.tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class SeleniumBase {


    public ChromeDriver  seleniumInit(String url){
        System.out.println("Starting Test...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(url);
        return driver;
    }
    public void seleniumClose (ChromeDriver driver) {

        driver.close();
        System.out.println("End Test...");

    }

}

