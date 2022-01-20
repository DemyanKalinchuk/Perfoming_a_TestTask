package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class LoginPage_Case3 extends BasePage {

    public LoginPage_Case3(WebDriver driver) {
        super(driver);
    }

    private final By clickreg3 = (By.xpath("/html/body/header/div/div/div/a[2]"));


    public LoginPage_Case3 clickreg3() {
        driver.findElement(clickreg3).click();
        return this;
    }


    private final By enterEmail3 = (By.id("identifierId"));

    public LoginPage_Case3 clickEmail3() {
        driver.findElement(enterEmail3).sendKeys("Test1@gmail.com", Keys.ENTER);


        return this;
    }


}