package selenium.pageObjectExample.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pageObjectExample.pages.LoginPage;
import selenium.pageObjectExample.pages.ProdPage;

public class TestLogin {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
ProdPage prodPage = new ProdPage(driver);

    }

}
