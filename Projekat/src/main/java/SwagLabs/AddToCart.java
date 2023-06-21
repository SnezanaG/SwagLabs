package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {

    public static WebDriver driver;


    public By addBackPackOnCart=By.xpath("//*//button[@data-test='add-to-cart-sauce-labs-backpack']");

    public By addOnesieSauceLabToCart=By.xpath("//*//button[@name='add-to-cart-sauce-labs-onesie']");

    public By addFleeceJacketSauceLabToCart=By.xpath("//button[@name='add-to-cart-sauce-labs-fleece-jacket']");

    public By shoppingCartIconItems=By.id("shopping_cart_container");

    public By contentOfShoppingBasket=By.xpath("//*//div[@class='cart_list']");

    public By myShoppingCart=By.xpath("//*//div[@class='header_secondary_container']");

    public By buttonRemoveBackPack=By.xpath("//*//button[@data-test='remove-sauce-labs-backpack']");

    public By buttonRemoveFleeceJacket=By.xpath("//*//button[@data-test='remove-sauce-labs-fleece-jacket']");

    public By shopingBasketAfterRemoveProducts=By.xpath("//*//div[@class='cart_item_label']");

    public By productOnShoppingCart=By.xpath("//*//div[@class='inventory_item_name']");



    public AddToCart(WebDriver driver){
        this.driver=driver;
    }



    public void clickAddBackPackAtCart(){
        driver.findElement(addBackPackOnCart).click();
    }

    public void clickAddOnesieAtCart(){
        driver.findElement(addOnesieSauceLabToCart).click();
    }

    public void clickAddFleeceJacketAtCart(){
        driver.findElement(addFleeceJacketSauceLabToCart).click();
    }

    public void clickOnShoppingBasket(){
        driver.findElement(shoppingCartIconItems).click();
    }

    public boolean shoppingCartIsDisplayed(){
        return driver.findElement(contentOfShoppingBasket).isDisplayed();
    }

    public  String textOnCartIsDisplayed(){
        return driver.findElement(myShoppingCart).getText();
    }

    public void clickButtonRemoveBackpack(){
        driver.findElement(buttonRemoveBackPack).click();
    }

    public void clickButtonRemoveFleeceJacket(){
        driver.findElement(buttonRemoveFleeceJacket).click();
    }

    public boolean shopingCartDisplayedAfterRemoveProducts(){
        return driver.findElement(shopingBasketAfterRemoveProducts).isDisplayed();
    }

    public String diplayedItemsOnShoppingCart(){
        return driver.findElement(productOnShoppingCart).getText();
    }


    }





