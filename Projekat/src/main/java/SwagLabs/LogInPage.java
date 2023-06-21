package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    public WebDriver driver;

    public By LogInPageUserName=By.xpath("//*//input[@placeholder='Username']");
    public By LogInPagePassword=By.xpath("//*//input[@placeholder='Password']");
    public By LogInButton=By.xpath("//*//input[@class='submit-button btn_action']");
    public By LogInPageWithWrongUsername=By.xpath("//*//h3[@data-test='error']");

    public By LogInWithWrongPassword=By.xpath("//*//h3[@data-test='error']");

    public By LogInEmptyEntryPassword=By.xpath("//*//h3[@data-test='error']");

    public By LogInEmptyEntryUserName=By.xpath("//h3[@data-test='error']");

    public LogInPage (WebDriver driver){

        this.driver=driver;
    }

    public void insertUserName(String enterName){
        driver.findElement(LogInPageUserName).sendKeys(enterName);
    }

    public void insertPassword(String enterPassword){

        driver.findElement(LogInPagePassword).sendKeys(enterPassword);
    }

    public void clickOnLogInButton(){

        driver.findElement(LogInButton).click();

    }

    public void logIn(){
        driver.findElement(LogInPageUserName).sendKeys("standard_user");
        driver.findElement(LogInPagePassword).sendKeys("secret_sauce");
        driver.findElement(LogInButton).click();



    }


     public String insertWrongUserName(){
       return  driver.findElement(LogInPageWithWrongUsername).getText();
    }


    public String insertWrongPassword(){
        return driver.findElement(LogInWithWrongPassword).getText();
    }

    public String logInWithoutPassword(){
        return driver.findElement(LogInEmptyEntryPassword).getText();
    }

    public String logInWithoutUserName(){
        return driver.findElement(LogInEmptyEntryUserName).getText();
    }









}
