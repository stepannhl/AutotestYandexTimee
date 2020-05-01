package Pages;

import com.google.common.base.Preconditions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Base extends LocatorsPage {
    private  WebDriver driver;
    public String NameOfCity="";


    public Base(WebDriver driver){
        this.driver = driver;
    }

    public void OpenSite(){
        driver.get(TestingSite());
    }

    public void Add_Button(){
        try{driver.findElement(Add_Button_locator()).click();}
        catch(org.openqa.selenium.NoSuchElementException e){Assert.fail("Локатор кнопки 'Добавить часы' отсутствует");}

    }

    public void Add_Or_Delete(boolean check)
    {
        if(check) {
            try{driver.findElement(inputLocator()).sendKeys("а");}
            catch(org.openqa.selenium.NoSuchElementException e){Assert.fail("Отсутствует Input. Кнопка Add_Button не сработала");}

            WebElement cityUl = driver.findElement(popup_Locator());
            List<WebElement> cityList = cityUl.findElements(By.tagName("div"));

            String NameOfCityBefore = cityList.get(0).getText();
            boolean checks = false;
            int i=0;
            while(NameOfCityBefore.charAt(i)!=','){             // Получаем название города для сравнения.
                NameOfCity += NameOfCityBefore.charAt(i);
                i++;
            }
            cityList.get(0).click();

        }
    }


    public void CheckElement()    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {}
            Assert.assertEquals(driver.findElement(card_Locator()).getText(),NameOfCity);

        }

}



