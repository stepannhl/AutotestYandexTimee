package Pages;

import com.google.common.base.Preconditions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Base extends LocatorsPage {
    private  WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public void OpenSite(){
        driver.get(TestingSite());
    }

    public void Add_Button(){
        driver.findElement(Add_Button_locator()).click();

    }

    public void Add_Or_Delete(boolean check)
    {
        if(check) {
            driver.findElement(inputLocator()).sendKeys(NameOfCity());
            driver.findElement(cityLocator()).click();
        }
    }


    public void CheckElement()    {
        try{
            Assert.assertTrue(driver.findElement(Check_CityLocator())!=null);}
        catch(AssertionError e) {
            Assert.fail("Result element cannot find.");}
    }



}
