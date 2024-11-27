package projectByPageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    @FindBy(id = "user-name")
    WebElement user;

    @FindBy (name = "")
    WebElement password ;

    private final WebDriver driver;

    public loginPage(WebDriver driver){
    this.driver = driver ;
        PageFactory.initElements(driver, this);

    }

   public void clickOnUser(){
//       System.out.println("Into click on Login");
//       WebElement login = driver.findElement(By.id("user-name"));
//       login.click();
 //      login.sendKeys("fdfdfd");


       user.click();
       user.sendKeys("fdfdfd");

   }



}
