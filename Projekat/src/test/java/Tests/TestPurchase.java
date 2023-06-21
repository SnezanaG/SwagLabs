package Tests;

import SwagLabs.AddToCart;
import SwagLabs.HomePage;
import SwagLabs.LogInPage;
import SwagLabs.Purchase;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class TestPurchase extends BaseTest{
    
    LogInPage logInPage=new LogInPage(driver);
    HomePage objLogIn =new HomePage(driver);
    AddToCart addtoCartPage=new AddToCart(driver);
    Purchase purchasefinish=new Purchase(driver);


    @Test
    public void TestPurchase() throws InterruptedException {
        logInPage.logIn();
        addtoCartPage.clickAddBackPackAtCart();
        addtoCartPage.clickOnShoppingBasket();
        purchasefinish.clickOnCheckoutButton();
        Assert.assertTrue("Checkout information not displayed",purchasefinish.displayCheckoutYourInformationPage());
        purchasefinish.insertFirstName();
        purchasefinish.insertLastName();
        purchasefinish.insertPostalCode();
        Thread.sleep(2000);
        purchasefinish.clickOnCheckoutContinueShopping();
        purchasefinish.clickOnButtonFinish();
        String expectedResultCompleteOrder="Checkout: Complete!";
        Assert.assertTrue("Order not complete", expectedResultCompleteOrder.equals(purchasefinish.displayCheckoutComplete()));
        purchasefinish.clickButtonBackToProducts();
        Assert.assertTrue("Home page not load", objLogIn.loadHomePage());

    }

    @Test
    public void TestPriceOfProduct() throws InterruptedException {
        logInPage.logIn();
        addtoCartPage.clickAddBackPackAtCart();
        addtoCartPage.clickAddFleeceJacketAtCart();
        addtoCartPage.clickAddOnesieAtCart();
        Thread.sleep(2000);
        addtoCartPage.clickOnShoppingBasket();
        purchasefinish.clickOnCheckoutButton();
        purchasefinish.insertFirstName();
        purchasefinish.insertLastName();
        purchasefinish.insertPostalCode();
        purchasefinish.clickOnCheckoutContinueShopping();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(" window.scrollBy(0,10000000000)","");
        String expectedPrice="Total: $95.01";
        Assert.assertTrue("Price is not true", expectedPrice.equals(purchasefinish.displayPriceOfProducts()));

    }
}
