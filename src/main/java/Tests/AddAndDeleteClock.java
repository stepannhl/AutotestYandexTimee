package Tests;

import Pages.Base;
import Pages.InitDriver;
import com.sun.org.apache.xml.internal.security.Init;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AddAndDeleteClock extends InitDriver {
    @Test
    public void Add_And_Remove_City(){
        Base base = PageFactory.initElements(driver, Base.class);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        base.OpenSite();
        base.Add_Button();
        base.Add_Or_Delete(true);

        base.CheckElement();
    }


}
