package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


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
    protected By popup_Locator(){
        return By.xpath("//div[contains(@class, 'visibility_visible')]//div[@class='popup__content']");
    }

    protected String NameOfCityPositive() {
            return "Агрыз";
        }

    protected By Check_CityLocator(){
        return By.xpath("//div[contains(text(), '"+ NameOfCityPositive() + "')]");
    }
    protected By container_Wrapp_Locator(){
        return By.xpath("//div[@class='container i-bem container_js_inited']");
    }
    protected By card_Locator(){
            return By.xpath("//div[contains(@class, 'tile_face_serif')]//div[@class='city__label']");
        }
}




