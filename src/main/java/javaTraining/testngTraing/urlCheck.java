package javaTraining.testngTraing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import selenium.SeleniumBase;

public class urlCheck {

    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.youtube.com/");
        String actUrl = driver.getCurrentUrl();
        Assert.assertEquals(actUrl,"https://www.youtube.com/","Current URL ias not as expected");
        System.out.println("Current url test pass");
        base.seleniumClose(driver);
    }

}
