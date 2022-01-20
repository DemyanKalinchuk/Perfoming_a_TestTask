package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.home.LoginPage_Case1;
import pages.home.LoginPage_Case2;
import pages.home.LoginPage_Case3;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    //TestCase_1_Login with correct email and password
    protected LoginPage_Case1 loginPage = new LoginPage_Case1(driver);
    protected LoginPage_Case1 enterEmail = new LoginPage_Case1(driver);
    protected LoginPage_Case1 enterPass = new LoginPage_Case1(driver);
    //TestCase_2_Login with correct email and wrong password
    protected LoginPage_Case2 loginPage2 = new LoginPage_Case2(driver);
    protected LoginPage_Case2 enterEmail2 = new LoginPage_Case2(driver);
    protected LoginPage_Case2 enterPass2 = new LoginPage_Case2(driver);
    //TestCase_3_Login user with wrong email
    protected LoginPage_Case3 loginPage3 = new LoginPage_Case3(driver);
    protected LoginPage_Case3 enterEmail3 = new LoginPage_Case3(driver);
    protected LoginPage_Case3 enterPass3 = new LoginPage_Case3(driver);





    @AfterTest
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");

        }

    }
    @AfterSuite(alwaysRun = true)
    public void close(){
        if (HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }

}
