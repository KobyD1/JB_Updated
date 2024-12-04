package mego.googleSearch.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class welcomePage {

    @FindBy (name = "q")
    WebElement search;


    private  ChromeDriver driver;

    public welcomePage(ChromeDriver driver){
    this.driver = driver ;
        PageFactory.initElements(driver,this);

}

public void searchForItem(String itemToFind){
search.click();
search.sendKeys(itemToFind);
search.sendKeys(Keys.ENTER);

}

}
