package mego.page_object_swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class productsPage {


    @FindBy (className = "product_sort_container")
    WebElement sort;

    @FindBy (className = "inventory_item_price")
    WebElement price;



    private  ChromeDriver driver;

    public productsPage (ChromeDriver driver){
    this.driver = driver ;
        PageFactory.initElements(driver,this);


}


public void getFirstPrice(){
    String price_as_text = price.getText();

}
public void setDropDown(int index ){
        Select select = new Select(sort);
        select.selectByIndex(index);

}
}
