package pages.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




import java.util.concurrent.TimeUnit;

import static Constants.Constant.TimeoutWariable.EXPLICIT_WAIT;
import static Constants.Constant.TimeoutWariable.IMPLICIT_WAIT;


public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;

    }

    public void show(String url){

        driver.get(url);
    }
    public WebElement weitElementIsVisible(WebElement element){
        driver.manage().timeouts().implicitlyWait(EXPLICIT_WAIT, TimeUnit.SECONDS);
        return (WebElement) driver;
    }


}
