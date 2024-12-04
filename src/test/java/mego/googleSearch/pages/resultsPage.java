package mego.googleSearch.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class resultsPage {


    @FindBy (className = "product_sort_container")
    WebElement sort;

    @FindBy (className = "inventory_item_price")
    WebElement price;



    private  ChromeDriver driver;

    public resultsPage(ChromeDriver driver){
    this.driver = driver ;
        PageFactory.initElements(driver,this);


}


public void getFirstLinkText(String patternToFind){
      List<WebElement> results = this.driver.findElements(By.className("LC20lb"));
      String firstPriceText = results.get(0).getText();
    System.out.println("the first price is  "+firstPriceText);
    for (WebElement element : results){
        String title = element.getText();
        Boolean isPass = title.contains(patternToFind);

        System.out.println("the title is "+title+", the results of the test is  "+isPass);
    }


}

    public void assertForFirstLink(String stringToFind){
        List<WebElement> results = this.driver.findElements(By.className("LC20lb"));
String firstLinkText = results.get(0).getText();
        Boolean isPass = firstLinkText.contains(stringToFind);
        System.out.println("first link text "+firstLinkText);
        Assert.assertTrue(stringToFind+" is not include in first link text",isPass);

    }

}
