package mego;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumBase {

    public  ChromeDriver seleniumInit (String url){

        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");    //fix for chrome version 111
        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new  ChromeDriver(options);
        driver.get(url);
        return driver ;


    }

    public  void seleniumClose(ChromeDriver driver){
        System.out.println("Closing test...");

        driver.close();


    }

}
