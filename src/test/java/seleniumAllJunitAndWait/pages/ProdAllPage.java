package seleniumAllJunitAndWait.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdAllPage {

    private WebDriver driver;

    @FindBy(className = "inventory_item_price")
    WebElement price;

    @FindBy(id= "react-burger-menu-btn")
    WebElement menuButton;

    @FindBy(id = "react-burger-cross-btn")
    WebElement closeMenuBtn;

    public ProdAllPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public int getPrice() {
        String prodPrice = price.getText();
        System.out.println("Price found it equals to " + prodPrice);
        prodPrice = prodPrice.replace("$","");
        int index = prodPrice.indexOf(".");
        prodPrice=prodPrice.substring(0,index);
        Integer priceAsInt = Integer. valueOf(prodPrice);

    return priceAsInt;

    }

    public void clickOnMenuBtn() throws InterruptedException {
        menuButton.click();
        Thread.sleep(5000);
        closeMenuBtn.click();
        Thread.sleep(5000);

    }



}
