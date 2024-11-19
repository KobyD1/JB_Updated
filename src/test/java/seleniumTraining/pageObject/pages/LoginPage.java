package seleniumTraining.pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class LoginPage {
    @FindBy(id = "user-name")
    WebElement user;

    @FindBy(id = "password")
    WebElement pw;

    @FindBy(name = "login-button")
    WebElement submit;
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//explicity wait
    public void loginToPage(String userToType, String pwToType){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) user));
        user.click();
        user.clear();
        user.sendKeys(userToType);

        pw.click();
        pw.clear();
        pw.sendKeys(pwToType);

        submit.click();


    }

    public String printUserPw(String user, String pw) {
        System.out.println("The user is " + user + "Pw is " + pw);
        if (user.length() == 4) {
            System.out.println("User length is 4");

        }
        return user;
    }


}
