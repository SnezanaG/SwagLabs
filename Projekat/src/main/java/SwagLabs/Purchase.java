package SwagLabs;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Purchase {

    public static WebDriver driver;


    public By continueShoppingButton=By.xpath("//*//button[@data-test='checkout']");

    public By checkoutYourInformation=By.xpath("//*//div[@class='checkout_info_container']");

    public By inputFieldFirstName=By.xpath("//input[@data-test='firstName']");

    public By inputFieldLastName=By.xpath("//*//input[@data-test='lastName']");

    public By inputFieldPostalCode=By.id("postal-code");

    public By continueButton =By.xpath("//*//input[@type='submit']");

    public By checkoutOverview=By.xpath("//*//div[@class='checkout_summary_container']");

    public By buttonFinishShopping=By.xpath("//button[@data-test='finish']");

    public By finishOrder=By.xpath("//*//div[@class='header_secondary_container']");

    public By backToProducts=By.id("back-to-products");

    public By paymentInformation=By.xpath("//div[@class='summary_info_label summary_total_label']");

    public Purchase(WebDriver driver){
        this.driver=driver;
    }


    public void clickOnCheckoutButton(){
        driver.findElement(continueShoppingButton).click();
    }

    public boolean displayCheckoutYourInformationPage(){
        return driver.findElement(checkoutYourInformation).isDisplayed();
    }

    public void insertFirstName(){
        driver.findElement(inputFieldFirstName).sendKeys("Biljana");

    }

    public void insertLastName(){
        driver.findElement(inputFieldLastName).sendKeys("Glisic");
    }

    public void insertPostalCode(){
        driver.findElement(inputFieldPostalCode).sendKeys("11271");
    }

    public void clickOnCheckoutContinueShopping(){
        driver.findElement(continueButton).click();
    }


    public void clickOnButtonFinish(){
        driver.findElement(buttonFinishShopping).click();
    }

    public String displayCheckoutComplete(){
        return driver.findElement(finishOrder).getText();
    }

    public void clickButtonBackToProducts(){
        driver.findElement(backToProducts).click();
    }

    public String displayPriceOfProducts(){
        return driver.findElement(paymentInformation).getText();
    }






























}
