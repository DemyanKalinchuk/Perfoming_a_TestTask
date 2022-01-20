package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage_Case1 extends BasePage {
    public LoginPage_Case1(WebDriver driver) {
        super(driver);
    }

    private final By clickreg = (By.xpath("/html/body/header/div/div/div/a[2]"));


    public LoginPage_Case1 clickreg() {
        driver.findElement(clickreg).click();
        return this;
    }


    private final By enterEmail = (By.id("identifierId"));

    public LoginPage_Case1 clickEmail() {
        driver.findElement(enterEmail).sendKeys("nationdyoma24@gmail.com", Keys.ENTER);
        return this;
    }

    private final By enterPass = (By.name("password"));

    public LoginPage_Case1 clickPass() {
        driver.findElement(enterPass).sendKeys("QWASZXedc123456", Keys.ENTER);
        return this;
    }
}
