package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage_Case2 extends BasePage {
    public LoginPage_Case2(WebDriver driver) {
        super(driver);
    }

    private final By clickreg2 = (By.xpath("/html/body/header/div/div/div/a[2]"));


    public LoginPage_Case2 clickreg2() {
        driver.findElement(clickreg2).click();
        return this;
    }


    private final By enterEmail2 = (By.id("identifierId"));

    public LoginPage_Case2 clickEmail2() {
        driver.findElement(enterEmail2).sendKeys("nationdyoma24@gmail.com", Keys.ENTER);
        return this;
    }

    private final By enterPass2 = (By.name("password"));

    public LoginPage_Case2 clickPass2() {
        driver.findElement(enterPass2).sendKeys("QWASZXedc", Keys.ENTER);
        return this;
    }
}