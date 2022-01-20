package tests.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static Constants.Constant.Urls.REALT_HOME_PAGE;


public class LoginPage extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(LoginPage.class);

    @Test (groups = {"smokeTest1"})
    public void checkLoginPage (){
        basePage.show(REALT_HOME_PAGE);
        loginPage
                .clickreg();
        logger.info("Click on the authorization button ");

        enterEmail
                .clickEmail();
        logger.info("input mail/number");

        enterPass
                .clickPass();
        logger.info("input password");

    }

    @Test (groups = {"smokeTest2"})
    public void checkLoginPage_2 (){
        basePage.show(REALT_HOME_PAGE);

        loginPage2
                .clickreg2();
        logger.info("Click on the authorization button ");

        enterEmail2
                .clickEmail2();
        logger.info("input mail/number");

        enterPass2
                .clickPass2();
        logger.info("input password");

    }

    @Test (groups = {"smokeTest3"})
    public void checkLoginPage_3 (){
        basePage.show(REALT_HOME_PAGE);

        loginPage3
                .clickreg3();
        logger.info("Click on the authorization button ");

        enterEmail3
                .clickEmail3();
        logger.info("input mail/number");



    }


}
