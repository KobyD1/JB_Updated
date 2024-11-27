package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class dropDownTraining {

    public static void main(String[] args) throws InterruptedException {
seleniumBase base = new seleniumBase();
        String  URL= "https://advantageonlineshopping.com/#/";
        ChromeDriver driver =base.seleniumInit(URL);
       sleep(3000);
        WebElement categories = driver.findElement(By.name("categoryListboxContactUs"));
        Select dropdown = new Select(categories);
        dropdown.selectByIndex(3);
       String catText =  categories.getText();

        System.out.println("cat text is "+catText);
//        dropdown.selectByIndex(3);
 base.seleniumClose(driver);
    }
}
