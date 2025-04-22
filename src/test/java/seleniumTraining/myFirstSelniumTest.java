package seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class myFirstSelniumTest {


        private WebDriver driver;

    @Before
        public void setUp() {
            WebDriverManager.chromedriver().setup(); // Automatically downloads the correct driver
            driver = new ChromeDriver();
        }

        @Test
        public void testGoogleTitle() {
            driver.get("https://www.google.com");
            String url = driver.getCurrentUrl();
            assertEquals("https://www.google.com/", url,"Page URL  is not as expected ");
        }
@After
public void tearDown() {
                driver.quit();
        }
    }

