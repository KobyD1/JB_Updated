package projectByPageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    @FindBy(id = "user-name")
    WebElement user;

    @FindBy (name = "password")
    WebElement password ;

    @FindBy(id = "login-button")
    WebElement loginButton;

    private final WebDriver driver;

    public loginPage(WebDriver driver){
    this.driver = driver ;
        PageFactory.initElements(driver, this);

    }

   public void loginWithUserPw(String userText , String pwText){

       user.click();
       user.sendKeys(userText);
       password.click();
       password.sendKeys(pwText);
       loginButton.click();

   }



}
