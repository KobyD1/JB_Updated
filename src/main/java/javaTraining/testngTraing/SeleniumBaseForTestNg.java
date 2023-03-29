package javaTraining.testngTraing;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumBaseForTestNg {


    public ChromeDriver  seleniumInit(String url){
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");    //fix for chrome version 111
        options.addArguments("--start-maximized");
//            options.setAcceptInsecureCerts(true);
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        return driver;
    }
    public void seleniumClose (ChromeDriver driver) {
        driver.close();
    }

}

