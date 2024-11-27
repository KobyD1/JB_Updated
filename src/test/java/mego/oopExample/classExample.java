package mego.oopExample;

import mego.seleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;

public class classExample {
    public static void main(String[] args) {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.calculator.net/");


        base.seleniumClose(driver);
    }
}
