package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;



    public By pageElements = By.id("inventory_container");


    public HomePage(WebDriver driver) {

        this.driver = driver;
    }
   public boolean loadHomePage(){
       return driver.findElement(pageElements).isDisplayed();
    }




    }



