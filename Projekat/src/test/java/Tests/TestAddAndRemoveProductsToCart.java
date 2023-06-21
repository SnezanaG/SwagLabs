package Tests;

import SwagLabs.AddToCart;
import SwagLabs.LogInPage;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;

public class TestAddAndRemoveProductsToCart extends BaseTest {

    LogInPage logInPage = new LogInPage(driver);
    AddToCart addtoCartPage=new AddToCart(driver);



    @Test
    public void TestAddProductsInBag() {
        logInPage.logIn();
        addtoCartPage.clickAddBackPackAtCart();
        addtoCartPage.clickAddOnesieAtCart();
        addtoCartPage.clickAddFleeceJacketAtCart();
        addtoCartPage.clickOnShoppingBasket();
        Assert.assertTrue("Items not displayed",addtoCartPage.shoppingCartIsDisplayed());
    }

    @Test
    public void TestYourCartDisplayed() {
        logInPage.logIn();
        addtoCartPage.clickAddBackPackAtCart();
        addtoCartPage.clickAddOnesieAtCart();
        addtoCartPage.clickAddFleeceJacketAtCart();
        addtoCartPage.clickOnShoppingBasket();
        String expectedTextWhenCartOpened="Your Cart";
        Assert.assertTrue(expectedTextWhenCartOpened.equals(addtoCartPage.textOnCartIsDisplayed()));


    }

    @Test
    public void TestRemoveProducts() {
        logInPage.logIn();
        addtoCartPage.clickAddBackPackAtCart();
        addtoCartPage.clickAddOnesieAtCart();
        addtoCartPage.clickAddFleeceJacketAtCart();
        addtoCartPage.clickButtonRemoveBackpack();
        addtoCartPage.clickButtonRemoveFleeceJacket();
        addtoCartPage.clickOnShoppingBasket();
        Assert.assertTrue("Page not displayed",addtoCartPage.shopingCartDisplayedAfterRemoveProducts());
        String expectedProductOnPage="Sauce Labs Onesie";
        Assert.assertTrue("Item displayed",expectedProductOnPage.equals(addtoCartPage.diplayedItemsOnShoppingCart()));


    }
}






