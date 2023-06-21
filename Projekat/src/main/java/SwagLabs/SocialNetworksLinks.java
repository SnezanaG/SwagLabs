package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SocialNetworksLinks {

    public static WebDriver driver;

    public By twiterLink=By.xpath("//*//a[@href='https://twitter.com/saucelabs']");
    public By facebookLink=By.xpath("//*//a[@href='https://www.facebook.com/saucelabs']");

    public By linkedinLink=By.xpath("//*//a[@href='https://www.linkedin.com/company/sauce-labs/']");

    public By twiterDisplay=By.id("main-content");

    public SocialNetworksLinks(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnTwiterLink(){
        driver.findElement(twiterLink).click();

    }

    public void clickOnFacebookLink(){
        driver.findElement(facebookLink).click();
    }

    public void clikOnLinkedinLink(){
        driver.findElement(linkedinLink).click();
    }

    public boolean linkedinDisplay(){
        return driver.findElement(twiterDisplay).isDisplayed();
    }



}
