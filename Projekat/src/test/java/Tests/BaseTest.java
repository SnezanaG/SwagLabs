package Tests;

import SwagLabs.HomePage;
import SwagLabs.LogInPage;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public static WebDriver driver;

    LogInPage logInPage=new LogInPage(driver);
    HomePage objLogIn =new HomePage(driver);



    @BeforeClass
    public static void beforeClass() throws Exception {

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();

    }

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");




    }

    @After
    public void tearDown() throws Exception {

        Thread.sleep(5000);

    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.quit();
    }

}
