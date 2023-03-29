package javaTraining.testngTraing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class multipleTestExample {

    SeleniumBaseForTestNg base = new SeleniumBaseForTestNg();

    @Test
    public void testForFrankYouTube() {
        ChromeDriver driver = base.seleniumInit("https://www.youtube.com/");
        WebElement search = driver.findElement(By.name("search_query"));
        search.click();
        search.clear();
        search.sendKeys("Frank");
        WebElement searchBtn = driver.findElement(By.id("search-icon-legacy"));
        searchBtn.click();

        base.seleniumClose(driver);
    }

    @Test
    public void test2() {
        System.out.println("into test2");

    }

    @Test
    public void test3() {
        System.out.println("into test2");

    }

//    @Test
//    public void testFailedExample() {
//
//        Assert.assertEquals(5, 4, "Failure found ");
//
//    }

}
