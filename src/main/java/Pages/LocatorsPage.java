package Pages;

import org.openqa.selenium.By;

public class LocatorsPage {
    protected String TestingSite(){ return "https://yandex.ru/time/";}

    protected By Add_Button_locator()
    {
        return By.xpath("//button[contains(@class, 'app__add-clock')]");
    }

    protected By cityLocator() {
            return By.xpath("//ul[@class='popup__items input__popup-items']//div[contains(text(), 'Агрыз')]");
        }

    protected By inputLocator() {
            return By.xpath("//div[contains(@class, 'tile_adding_yes')]//input[@class='input__control']");
        }

    protected String NameOfCity() {
            return "Агрыз";
        }
    protected By Check_CityLocator(){
        return By.xpath("//div[contains(text(), 'Агрыз')]");
    }
}


