package projectByPageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productPage {

    @FindBy(className = "inventory_item_price")
    WebElement firstPrice;



    private final WebDriver driver;

    public productPage(WebDriver driver ){
        this.driver = driver ;
        
    }

    public String  getFirstPrice() throws InterruptedException {
        System.out.println("Getting First Price ");
        Thread.sleep(3000);
        String  firstPriceText = driver.findElement(By.className("inventory_item_price")).getText();
        System.out.println("first price found the value is "+firstPriceText);
        return firstPriceText;
    }
    
    
}
