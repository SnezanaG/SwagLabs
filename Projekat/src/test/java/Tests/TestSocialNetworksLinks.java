package Tests;

import SwagLabs.LogInPage;
import SwagLabs.SocialNetworksLinks;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;

public class TestSocialNetworksLinks extends BaseTest {

    LogInPage logInPage=new LogInPage(driver);

    SocialNetworksLinks socialNetwork=new SocialNetworksLinks(driver);


    @Test
    public void TestTwiterLinks() {
        logInPage.logIn();
        socialNetwork.clickOnTwiterLink();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(" window.scrollBy(0,10000000000)","");


        String parent = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        String expectedUrl="https://twitter.com/saucelabs";


    }

    @Test
    public void TestLinkedInLink() {
        logInPage.logIn();
        socialNetwork.clikOnLinkedinLink();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(" window.scrollBy(0,10000000000)","");
        String parent = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        String expectedUrlLinkedIn="https://www.linkedin.com/company/sauce-labs/";
//        Assert.assertTrue("Linkedin not display", expectedUrlLinkedIn.equals(socialNetwork.linkedinDisplay()));

    }
}
