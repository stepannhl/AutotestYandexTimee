package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {

    private WebDriver driver;
    public Base(WebDriver driver){
        this.driver = driver;
    }
    private By add_Button_Locator = By.xpath("//button[contains(@class, 'app__add-clock')]");
    private By cityLocator = By.xpath("//ul[@class='popup__items input__popup-items']//div[contains(text(), 'Агрыз')]");
    private By inputLocator = By.xpath("//div[contains(@class, 'tile_adding_yes')]//input[@class='input__control']");
    private By CheckCityLocator = By.xpath("//div[contains(text(), 'Агрыз')]");
    private String NameOfCity ="Агрыз";

    public void Add_Button(){
        driver.findElement(add_Button_Locator).click();

    }

    public void Add_Or_Delete(boolean check)
    {
        if(check) {
            driver.findElement(inputLocator).sendKeys(NameOfCity);
            driver.findElement(cityLocator).click();
        }
    }
    public void CheckElement()    {
        try{
            Assert.assertNotNull(CheckCityLocator);}
        catch(AssertionError e) {
            Assert.fail("Result element cannot find.");}
    }
}
