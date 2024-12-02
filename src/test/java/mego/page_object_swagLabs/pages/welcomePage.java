package mego.page_object_swagLabs.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomePage {

    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passwordMenu;

    @FindBy(id = "login-button")
    WebElement login;



    private ChromeDriver driver;

    public welcomePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginToSwagLabs(String user , String password ){
        userName.click();
        userName.sendKeys(user);
        passwordMenu.click();
        passwordMenu.sendKeys(password);
        login.click();


    }



}
