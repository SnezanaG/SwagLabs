package Tests;

import SwagLabs.HomePage;
import SwagLabs.LogInPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogInTest extends BaseTest{

    LogInPage logInPage=new LogInPage(driver);
    HomePage objLogIn =new HomePage(driver);



    @Test
    public void LogInPageCorrectCredentials() {
        logInPage.logIn();
        Assert.assertTrue("User is not loged in", objLogIn.loadHomePage());
    }

    @Test
    public void LogInPageWrongUserName() {
        logInPage.insertUserName("aaaaaa");
        logInPage.insertPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        String logInErorUserName="Epic sadface: Username and password do not match any user in this service";
        Assert.assertTrue("home page is loaded", logInErorUserName.equals(logInPage.insertWrongUserName()));
    }

    @Test
    public void LogInPageWrongPassword() {
        logInPage.insertUserName("standard_user");
        logInPage.insertPassword("sssssss");
        logInPage.clickOnLogInButton();
        String logInErrorPassword="Epic sadface: Username and password do not match any user in this service";
        Assert.assertTrue("Home page loaded",logInErrorPassword.equals(logInPage.insertWrongPassword()));

    }

    @Test
    public void LogInWithoutPassword() {
        logInPage.insertUserName("standard_user");
        logInPage.insertPassword("");
        logInPage.clickOnLogInButton();
        String logInErrorMessage="Epic sadface: Password is required";
        Assert.assertTrue("Home page loaded",logInErrorMessage.equals(logInPage.logInWithoutPassword()));
    }

    @Test
    public void LogInWithoutUserName() {
        logInPage.insertUserName("");
        logInPage.insertPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        String logInMessageForEmptyUserName="Epic sadface: Username is required";
        Assert.assertTrue("Home page loaded",logInMessageForEmptyUserName.equals(logInMessageForEmptyUserName));
    }
}
