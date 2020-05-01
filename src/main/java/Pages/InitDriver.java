package Pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitDriver {

        public WebDriver driver;
        public WebDriverWait wait;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }

        @After
        public void close(){
            driver.quit();
        }


    }


